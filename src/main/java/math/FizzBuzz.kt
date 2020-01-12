package math

class FizzBuzz {

    fun fizzBuzz(n: Int): List<String> {
        val fizzBuzzList: MutableList<String> = mutableListOf()
        for (num in 1..n) {
            fizzBuzzList += when {
                num % 15 == 0 -> "FizzBuzz"
                num % 3 == 0 -> "Fizz"
                num % 5 == 0 -> "Buzz"
                else -> num.toString()
            }
        }
        return fizzBuzzList
    }
}