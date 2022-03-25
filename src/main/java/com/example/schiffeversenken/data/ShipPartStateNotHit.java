package com.example.schiffeversenken.data;

public class ShipPartStateNotHit implements ShipPartState {


    @Override
    public int hit() {
        return 1;
    }
}
