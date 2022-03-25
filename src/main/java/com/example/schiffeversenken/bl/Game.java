package com.example.schiffeversenken.bl;


import com.example.schiffeversenken.data.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;


public class Game {
    private int id;
    private Player player1;
    private Player player2;
    private int difficulty;
    private Player winner;

    public Game(int id, Player player1, Player player2, int difficulty, Player winner) {
        this.player1 = player1;
        this.player2 = player2;
        this.difficulty = difficulty;
        this.winner = winner;
        this.id = id;
    }

    public boolean shoot(Player victim, Coordinates coordinates) {
        for (Ship s : victim.getShips()) {
            Optional<ShipPart> ship_part = s.getShip_parts().stream().filter(sp -> sp.getCoordinates().equals(coordinates)).findFirst();
            if (ship_part.isPresent() && ship_part.get().getState().hit() == 1) {
                ship_part.get().setState(new ShipPartStateHit());
                return true;
            }
        }
        return false;
    }
}
