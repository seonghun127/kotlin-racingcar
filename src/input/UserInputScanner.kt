package input

import java.util.*

class UserInputScanner: UserInput{
    override fun input(): String {
        val sc = Scanner(System.`in`)
        return sc.nextLine()
    }
}