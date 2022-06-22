<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Game</title>

    <script src="schiffeversenken.js"></script>
    <link href="tailwindcss.css" type="text/css" rel="stylesheet">

    <script type="text/javascript">
        /*
        var wsocket;
        function connect(){
            wsocket = new WebSocket("http://localhost:8080/SchiffeVersenken-1.0-SNAPSHOT/game1");
            wsocket.onmessage = onMessage;
        }
        function onMessage(evt){
            var arraypv = evt.data.split("/");
            document.getElementById("coordinate").innerHTML = arraypv[0];
            document.getElementById("hit").innerHTML = arraypv[1];
        }
        window.addEventListener("load",connect,false);

        function printGameCode(){
            document.getElementById("gamecode").innerHTML = localStorage.getItem('gameId');
        }
        */

        /*
        window.onload = () => {
            for(let i = 0; i < 100; i++){
                document.getElementById("grid-container").innerHTML += '<div class="grid-container-child hover:bg-sky-800" id="' + i.toString + '">Grid</div>';
            }
        };
        */
    </script>

</head>
<body>
    <table class="grid-container">
        <?php
            for ($i=0; $i < 10; $i++) { 
                echo '<tr>';
                for ($j=0; $j < 10; $j++) { 
                    echo '<td class="grid-child hover:bg-sky-800" id="' . $i . $j . '">&nbsp;</td>';
                }
                echo '</tr>';
            }
        ?>
    </table>
    <div id="shiptoplace">
        <table id="ships">
            <?php
                for($i=1; $i <= 4; $i++) {
                    for($h=0; $h < $i; $h++) {
                        echo '<tr class="ship">';
                        for($j=1; $j <= 6 - $i; $j++){
                           echo '<td class="shippart">&nbsp</td>';
                        }
                        echo '</tr>';
                    }
                }
            ?>
        </table>
    </div>
</body>
</html>
