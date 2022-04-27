package com.example.schiffeversenken.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShipPart {

    private Coordinates coordinates;
    private ShipPartState state;
}
