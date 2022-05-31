import com.example.schiffeversenken.data.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ShipTest {

    @Test
    public void addShipPart(){
        Ship ship = new Ship();
        ship.addPart(new ShipPart(new Coordinates(0, 0), new ShipPartStateNotHit()))
                .addPart(new ShipPart(new Coordinates(1, 0), new ShipPartStateNotHit()));

        assertTrue(ship.getShip_parts() != null);
    }

    @Test
    public void addCoordinates(){
        ShipPart shipPart = new ShipPart(new Coordinates(2,5), new ShipPartStateNotHit());

        assertTrue(shipPart.getCoordinates().getX() == 2 && shipPart.getCoordinates().getY() == 5);
    }

    @Test
    public void checkState(){
        ShipPart notHit = new ShipPart(new Coordinates(2,5), new ShipPartStateNotHit());
        ShipPart hit = new ShipPart(new Coordinates(0, 0), new ShipPartStateHit());

        assertTrue(!notHit.getState().equals(hit.getState()));
    }
}
