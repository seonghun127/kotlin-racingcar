package util

import kotlin.streams.toList

private const val DELIMITER: String = ","

class CarNameSpliter(var inputCarNames: String) {

    companion object {
        fun split(inputCarNames: String): List<String> {
            val replaced = inputCarNames.replace(" ", "")
            return replaced.split(DELIMITER).stream().toList()
        }
    }
}