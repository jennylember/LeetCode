package string

class ValidPalindrome {
    fun isPalindrome(s: String): Boolean {
        var flag = false
        var palindrome: String = ""
        for (i in s.indices) {
            if (s[i].isLetterOrDigit()) {
                palindrome += s[i]
            }
        }
        if (palindrome.isEmpty() || palindrome.length == 1) {
            return true
        }
        palindrome = palindrome.toLowerCase()
        for(i in 0 until palindrome.length / 2) {
            if (palindrome[i] == palindrome[palindrome.length - 1 - i]) {
                flag = true
            } else {
                flag = false
                break
            }
        }

        return flag
    }
}