package rank

import car.Car

class Ranking {
    companion object {
        fun rank(cars: List<Car>): Car {
            var max: Car = cars[0]
            for (i in 1 until cars.size) {
                if (cars[i].isGreaterThan(max)) {
                    max = cars[i]
                }
            }
            return max
        }
    }
}