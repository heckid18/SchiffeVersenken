package com.example.schiffeversenken.data;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Game {
    private Player player1;
    private Player player2;
    private int difficulty;
    private Player winner;
}
