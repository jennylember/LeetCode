package string

class StringToInteger {
    fun myAtoi2(str: String): Int {

        val wordsList = str.trim().split(" ", ".", ",")

        val firstWordNullable = wordsList.firstOrNull() { it.isNotEmpty() }
        if (firstWordNullable == null || firstWordNullable.isEmpty()) {
            return 0
        }

        var firstWord = firstWordNullable

        var negative = false
        var resultInt = 0

        if (firstWord[0].isLetter()) {
            return 0
        }

        if (firstWord[0] == '-') {
            negative = true
            firstWord = firstWord.replace("-", "")
        }

//        firstWord = firstWord.replace("-", "")
//        firstWord = firstWord.replace("+", "")

        if (firstWord.isEmpty()) {
            return 0
        }

        try {
            resultInt = firstWord.toInt()
            if (negative) {
                resultInt = resultInt.unaryMinus()
            }
        } catch (e: NumberFormatException) {
            return if (negative) {
                -2147483648
            } else {
                2147483647
            }
        }

        return resultInt
    }


    fun myAtoi(str: String): Int {
        var resultInt = 0
        var negative = false
        val firstWord = str.trim { it <= ' ' }
      //  val firstWord = str.trim().split(" ")[0]
        var firstInt = "0"
        var count = 0

        if (firstWord.isEmpty()) {
            return 0
        }

        if (firstWord[0] == '-') {
            negative = true
            count = 1
        }

        if (firstWord[0] == '+') {
            negative = false
            count = 1
        }

        if (firstWord[0].isLetter()) {
            return 0
        }

        while(count < firstWord.length) {
            if (!firstWord[count].isDigit()) {
                break
            } else {
                firstInt += firstWord[count]
                count++
            }
        }

        try {
            resultInt = firstInt.toInt()
            if (negative) {
                resultInt = resultInt.unaryMinus()
            }
        } catch (e: NumberFormatException) {
            return if (negative) {
                -2147483648
            } else {
                2147483647
            }
        }


        return resultInt
    }
}