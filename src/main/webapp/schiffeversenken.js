let grid;
let ships;

class GridSquare{
    constructor(x_coordinate, y_coordinate, hasShip, isHit){
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
        this.hasShip = hasShip;
        this.isHit = isHit;
    }

}

class Ship{
    constructor(x_coordinate, y_coordinate, lenght, direction){
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
        this.lenght = lenght;
        this.direction = direction;
    }
}

function initGrid(){
    for(let i = 0; i<10; i++){
        for(let j = 0; j<10, j++){
            grid[i][j] = new GridSquare(i, j, false, false)
        }
    }
}

function initShipList(){
    ships[0] = new Ship(null, null, 2, null);
    ships[1] = new Ship(null, null, 3, null);
    ships[2] = new Ship(null, null, 3, null);
    ships[3] = new Ship(null, null, 4, null);
    ships[4] = new Ship(null, null, 5, null);
}

