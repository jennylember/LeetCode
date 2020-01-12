package array

import kotlin.math.pow

class PlusOne {
    fun plusOne(digits: IntArray): IntArray {
        val digitsPlusOne = arrayListOf<Int>()
        var value: Long = 0
        val const = 10.0

        for (i in digits.indices) {
            value += digits[i] * const.pow(digits.size - 1 - i).toInt()
        }

        value++

        while (value > 0) {
            digitsPlusOne.add((value % 10).toInt())
            value /= 10
        }
        digitsPlusOne.reverse()
        return digitsPlusOne.toIntArray()
    }

    fun plusOne2(digits: IntArray): IntArray {
        val digitsPlusOne = arrayListOf<Int>()
        var count = -1

        for (i in digits.size - 1 downTo 0) {
            if (digits[i] != 9) {
                digitsPlusOne.add(digits[i] + 1)
                count = i
                break
            } else {
                digitsPlusOne.add(0)
            }
        }

        if (count == -1) {
            digitsPlusOne.add(1)
        } else {
            for (i in count - 1 downTo 0) {
                digitsPlusOne.add(digits[i])
            }
        }

        digitsPlusOne.reverse()
        return digitsPlusOne.toIntArray()
    }
}