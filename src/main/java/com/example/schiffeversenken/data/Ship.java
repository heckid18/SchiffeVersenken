package com.example.schiffeversenken.data;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    List<ShipPart> ship_parts = new ArrayList<ShipPart>();

    public Ship(List<ShipPart> ship_parts) {
        this.ship_parts = ship_parts;
    }
}
