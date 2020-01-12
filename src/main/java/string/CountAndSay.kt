package string

class CountAndSay {


    fun countAndSay(n: Int): String {
        return recursion(n, 1, "1")
    }

    fun recursion(n: Int, count: Int, str: String): String {
        return if (n == count) {
            str
        } else {
            recursion(n, count + 1, countNext(str))
        }
    }

    fun countNext(str: String): String {
        var count = 0
        var countNext = ""
        var i = 0
        while(i < str.length) {

            while(i + count < str.length) {
                if (str[i] == str[i + count]) {
                    count++
                } else {
                    break
                }
            }

            countNext += count.toString() + str[i]
            i += count
            count = 0
        }
        return countNext
    }

}