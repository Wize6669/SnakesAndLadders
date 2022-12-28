fun main(args: Array<String>) {

    val numberPlayers: Int
    var logicGame = LogicGame()
    println("Enter the number of players: ")
    numberPlayers = readLine()!!.toInt()
    when(numberPlayers){
        1 -> {
            val players = intArrayOf(1)
            println("Start of the Game")
            while (true){
                for ((i,s) in players.withIndex()){
                    val nextSquare = logicGame.turn(i+1, s)
                    if (nextSquare == 100){
                        println("Game over")
                        println("Player ${i+1} wins!")
                        return
                    }
                    players[i] = nextSquare
                    println()
                }
            }
        }
        2 -> {
            val players = intArrayOf(1, 1)
            println("Start of the Game")
            while (true){
                for ((i,s) in players.withIndex()){
                    val nextSquare = logicGame.turn(i+1, s)
                    if (nextSquare == 100){
                        println("Game over")
                        println("Player ${i+1} wins!")
                        return
                    }
                    players[i] = nextSquare
                    println()
                }
            }
        }
        3 -> {
            val players = intArrayOf(1, 1, 1)
            println("Start of the Game")
            while (true){
                for ((i,s) in players.withIndex()){
                    val nextSquare = logicGame.turn(i+1, s)
                    if (nextSquare == 100){
                        println("Game over")
                        println("Player ${i+1} wins!")
                        return
                    }
                    players[i] = nextSquare
                    println()
                }
            }
        }else -> {
            println("The amount entered is not allowed")
        }
    }
}