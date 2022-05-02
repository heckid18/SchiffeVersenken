package com.example.schiffeversenken.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ship {

    private List<ShipPart> ship_parts = new ArrayList<>();

    public Ship addPart(ShipPart part) {
        ship_parts.add(part);
        return this;
    }

}
