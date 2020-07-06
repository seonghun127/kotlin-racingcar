package car

import kotlin.streams.toList

// TODO make singleton
class CarFactory {
    companion object {
        fun create(carNames: List<String>): List<Car> {
            return carNames.stream()
                .map(::create)
                .toList()
        }

        private fun create(carName: String): Car {
            return Car(carName)
        }
    }
}