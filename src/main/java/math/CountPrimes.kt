package math

import kotlin.math.sqrt

class CountPrimes {
    fun countPrimes(n: Int): Int {
        val primes = ArrayList<Int>()
        for (digit in 0 until n - 2) {
            primes.add(digit + 2)
        }
        var prime = 2
        var index: Int
        var size = primes.size

        while (prime < n) {
            index = prime - 1
            while (index < size) {
                if (primes[index] % prime == 0) {
                    primes.removeAt(index)
                    size--
                } else {
                    index++
                }
            }

            prime++
        }

        return primes.size
    }




    fun countPrimes2(n: Int): Int {
        var count = 0
        for (index in 1 until n) {
            if (isPrime(index)) count++
        }
        return count
    }

    private fun isPrime(num: Int): Boolean {
        if (num <= 1) return false

        var n2 = sqrt(num.toDouble()).toInt()
        for (index in 2 .. n2) {
            if (num % index == 0) return false
        }
        return true
    }


}