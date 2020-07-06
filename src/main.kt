import car.CarFactory
import car.CarMovement
import input.UserInput
import input.UserInputScanner
import rank.Ranking
import util.CarNameSpliter

fun main() {
    val input: UserInput = UserInputScanner()
    val inputCarNames: String = input.input()
    val round = input.input().toInt()

    val names = CarNameSpliter.split(inputCarNames)
    val cars = CarFactory.create(names)

    for (i in 1..round) {
        CarMovement.move(cars)
    }

    val winner = Ranking.rank(cars)
    print("This winner is ${winner.name}! position is ${winner.position}")
}