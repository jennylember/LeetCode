package math

class RomanToInteger {

    enum class RomanNumbers(val number: Int) {
        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        D(500),
        M(1000)
    }

    fun romanToInt(s: String): Int {
        var sum = 0
        var cur = 0
        var next = 0
        var index = 0



        while (index < s.length) {
            cur = enumValueOf<RomanNumbers>(s[index].toString()).number
            if (index < s.length - 1) {
                next = enumValueOf<RomanNumbers>(s[index + 1].toString()).number
            }

            if (next > cur) {
                sum += next - cur
                index++
                next = 0
            } else {
                sum += cur
            }
            index++


//            * If I comes before V or X, subtract 1 eg: IV = 4 and IX = 9
//            * If X comes before L or C, subtract 10 eg: XL = 40 and XC = 90
//            * If C comes before D or M, subtract 100 eg: CD = 400 and CM = 900
        }

        return sum
    }


}