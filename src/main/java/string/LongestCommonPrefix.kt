package string

import javax.management.RuntimeErrorException

class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) {
            return ""
        }
        var commonStr = ""

        var myMap = LinkedHashMap<Int, Pair<Char, Int>>()
        val firstWord = strs.min() ?: return ""

        for (i in firstWord.indices) {
            myMap[i] = Pair(firstWord[i], 1)
        }

        for (word in strs) {
            for (letterIndex in word.indices) {
                val (currentChar, currentInt) = myMap[letterIndex] ?: continue
                if (currentChar == word[letterIndex]) {
                    myMap[letterIndex] = Pair(currentChar, currentInt + 1)
                } else {
                    break
                }
            }
        }


        myMap.forEach { _, (char, int) -> if (int == strs.size + 1) commonStr += char }

        return commonStr
    }
}