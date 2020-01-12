package string

class ReverseString {
    fun reverseString(s: CharArray) {
        var currentChar: Char
        val maxIndex = s.size - 1
        for(i in 0 until s.size / 2) {
            currentChar = s[i]
            s[i] = s[maxIndex - i]
            s[maxIndex - i] = currentChar
        }
    }
}