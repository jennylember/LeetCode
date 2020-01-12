package math

import kotlin.math.log10

class PowerOfThree {

    fun isPowerOfThree(n: Int): Boolean {

        return ((log10(n.toDouble()) / log10(3.0)) % 1) == 0.0

    }

    fun isPowerOfThree2(n: Int): Boolean {
        var flag = false

        if (n == 1) return true

        if (n < 1) return false


        var n2 = n
        if (n2 % 3 == 0) {
            n2 /= 3
            flag = isPowerOfThree2(n2)
        }

        return flag
    }


}