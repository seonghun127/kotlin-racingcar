package car

import random.RandomNumberGenerator

class CarMovement {
    companion object {
        fun move(cars: List<Car>) {
            cars.forEach { car ->
                car.move(object : RandomNumberGenerator {
                    override fun generate(): Int {
                        return (Math.random() * 10).toInt()
                    }
                })
            }
        }
    }
}