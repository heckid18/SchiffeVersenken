# Schiffe versenken
## Projektidee
Ein simples "Schiffe versenken" Spiel, welches zwei Spieler gegeneinander Spielen lässt. Das Spielfeld ist im Stil eines Rasters und die Schiffe werden durch durch ausgemalte Rasterkästchen repräsentiert.

## Verwendete Design Patterns
- State Pattern
- Observer Pattern
- (Decorator Pattern)

## Klassendiagramm

```mermaid
classDiagram

    ShipPartState <|-- ShipPartStateNotHit
    ShipPartState <|-- ShipPartStateHit

    class Ship{
        - parts: List ~ShipPart~
    } 

    class ShipPart{
        - position: Coordinate
        - state: ShipPartState

    }

    class Player{
        - name: String
        - ships: List ~Ship~
    }

    class Game{
        - player1: Player
        - player2: Player
        - difficulty: int
        - winner: Player
    }

    class ShipPartState{

    }

    class ShipPartStateNotHit{
        hit()
    }

    class ShipPartStateHit{

    }
```

## Wireframes