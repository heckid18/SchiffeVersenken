package com.example.schiffeversenken.api;

import javax.websocket.OnClose;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

@ServerEndpoint("/game1")
public class GameSocket {
    private static final Logger logger = Logger.getLogger("GameSocket");

    static Queue<Session> queue = new ConcurrentLinkedQueue<>();


    public static void send(int coordinate, boolean hit){
        String msg = "i have been hit";

        for(Session session: queue){
            try {
                session.getBasicRemote().sendText(msg);
                logger.log(Level.INFO,"Sent: {0}",msg);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @OnOpen
    public void openConnection(Session session){
        queue.add(session);
        logger.log(Level.INFO,"Connection opened");
    }

    @OnClose
    public void closedConnection(Session session){
        queue.remove(session);
    }
}
