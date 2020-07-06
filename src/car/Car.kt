package car

import random.RandomNumberGenerator
import java.lang.IllegalArgumentException

const val NAME_LENGTH_CONDITION: Int = 5
const val RANDOM_NUMBER_CONDITION: Int = 4

class Car(
    var name: String,
    var position: Int = 0
) {
    init {
        validate()
    }

    private fun validate() {
        if (name.isEmpty() || name.length > NAME_LENGTH_CONDITION) {
            throw IllegalArgumentException("자동차 이름 형식 오류!")
        }
    }

    fun move(generator: RandomNumberGenerator): Int {
        val number = generator.generate()

        if (number > RANDOM_NUMBER_CONDITION) {
            ++position
        }

        return position
    }

    fun isGreaterThan(car: Car): Boolean {
        return this.position > car.position
    }
}