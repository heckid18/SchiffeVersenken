package com.example.schiffeversenken.api;

import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

@ServerEndpoint(value = "/game/{id}")
public class GameEndpoint {

    private Session session;
    private static Set<GameEndpoint> gameEndpoints = new CopyOnWriteArraySet<>();


    @OnOpen
    public void onOpen(Session session) throws IOException {
        this.session = session;
        gameEndpoints.add(this);


    }

}
