package string

import java.lang.NumberFormatException
import java.lang.RuntimeException


class ReverseInteger {

    fun reverse(x: Int): Int {
        var result = 0
        val str: String
        var minus = false

        if (x < 0) {
            result = x.unaryMinus()
            minus = true
        } else {
            result = x
        }

        str = result.toString().reversed()

        try {
            result = str.toInt()
        } catch (e: NumberFormatException) {
            return 0
        }

        if (minus) {
            result = result.unaryMinus()
        }

        return result

    }
}