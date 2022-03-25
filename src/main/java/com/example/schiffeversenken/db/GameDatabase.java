package com.example.schiffeversenken.db;

import com.example.schiffeversenken.bl.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class GameDatabase {

    private GameDatabase instance;

    private List<Game> games = new ArrayList<>();

    public GameDatabase(){

    }

    public synchronized GameDatabase getInstance() {
        if(instance == null){
            instance = new GameDatabase();
        }
        return instance;
    }

    public void addGame(Game game){
        games.add(game);
    }

    public void deleteGameById(int id){
        Optional<Game> game = games.stream().filter(g -> g.getId() == id).findFirst();

        if (game.isPresent()){
            games.remove(game.get());
        }
        else {
            throw new NoSuchElementException();
        }
    }

    public Game getGameById(int id){
        Optional<Game> game = games.stream().filter(g -> g.getId() == id).findFirst();

        if(game.isPresent()) {
            return game.get();
        }
        else {
            throw new NoSuchElementException();
        }
    }
}
