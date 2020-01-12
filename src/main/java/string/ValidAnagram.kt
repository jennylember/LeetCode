package string

class ValidAnagram {

    fun isAnagram(s: String, t: String): Boolean {
        val flag: Boolean
        var sum = 0

        for (i in s.indices) {
            sum = sum xor s[i].toInt()
        }

        for(i in t.indices) {
            sum = sum xor t[i].toInt()
        }

        flag = sum == 0
        return flag
    }

    fun isAnagram2(s: String, t: String): Boolean {
        var flag = false
        if(s.length != t.length){
            return false
        }
        val charArray1: CharArray = s.toCharArray()
        val charArray2: CharArray = t.toCharArray()
        charArray1.sort()
        charArray2.sort()

        if (charArray1.contentEquals(charArray2)) {
            flag = true
        }
        return flag
    }


}