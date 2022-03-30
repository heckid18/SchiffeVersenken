package com.example.schiffeversenken.api;

import com.example.schiffeversenken.bl.Game;
import com.example.schiffeversenken.db.GameDatabase;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriBuilder;
import jakarta.ws.rs.core.UriInfo;

@Path("/game")
public class GameResource {
    //TODO: Implement methods

    @Context
    private UriInfo uriInfo;

    @GET
    @Produces("application/json")
    public Response createGame(Game game) {
        GameDatabase.getInstance().addGame(game);

        UriBuilder uriBuilder = uriInfo.getAbsolutePathBuilder();

        uriBuilder.path("" + game.getId());

        return Response.created(uriBuilder.build()).entity(game).build();
    }
}