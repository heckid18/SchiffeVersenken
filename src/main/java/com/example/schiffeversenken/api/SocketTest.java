package com.example.schiffeversenken.api;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import jakarta.inject.Singleton;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

@Path("/game")
public class SocketTest {

    private Random random;
    private volatile int coordinate = 1;
    private volatile boolean hit = false;
    private static final Logger logger = Logger.getLogger("SocketTest");

    @POST
    public void init(){
        logger.log(Level.INFO,"Initializing socket");

        for( int i = 0; i < 100; i++){
            coordinate += 1*(random.nextInt(20)-1)/20;
            GameSocket.send(coordinate,hit);
        }
    }

}
