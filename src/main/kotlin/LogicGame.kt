import java.util.*

class LogicGame {
    val rand = Random()
    val snakeAndLadderPosition = mapOf(
        2 to 38, 7 to 14, 8 to 31, 15 to 26, 21 to 42, 28 to 84, 46 to 25,
        49 to 11, 51 to 67, 62 to 19, 64 to 60, 71 to 91, 74 to 53, 78 to 98,
        87 to 94, 92 to 88, 95 to 75, 99 to 80
    )

    fun turn(player: Int, square: Int): Int{
        var square2 = square
        while (true){
            val roll = 1 + rand.nextInt(6)
            println("Player ${player},on square ${square2}, rolls ${roll} ")
            if(square2 + roll > 100){
                println("The game is not over yet");
                println()
            }else{
                square2 += roll
                println(" and moves to square ${square2}")
                if (square2 == 100) return 100
                val nextSquare = snakeAndLadderPosition.getOrDefault(square2, square2)
                if (square2 < nextSquare){
                    println("You found a ladder !!, climb up to ${nextSquare} :)")
                    println()
                    if (nextSquare == 100) return 100
                    square2 = nextSquare
                }else if(square2 > nextSquare) {
                    println("You found a snake !!, slither down to ${nextSquare} :( ")
                    println()
                    square2 = nextSquare
                }
            }
        }
    }

}