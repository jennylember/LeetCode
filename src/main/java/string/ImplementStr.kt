package string

class ImplementStr {
    fun strStr(haystack: String, needle: String): Int {
        var index = -1
        var i = 0
        var j = 0
        var flag = false
        if (needle.length > haystack.length) {
            return -1
        }

        if (needle.isEmpty() || haystack.contentEquals(needle)) {
            return 0
        }

        while (i < haystack.length) {
            if (j == needle.length) {
                flag = true
                break
            }
            while (j < needle.length) {
                if (haystack[i] == needle[j]) {
                    i++
                    j++
                } else {
                    i++
                    j = 0
                    break
                }
            }
        }
        if (flag) {
            index = i - j
        }
        return index
    }

    fun strStr2(haystack: String, needle: String): Int {
        var index = -1
        var count = 0

        if (needle.length > haystack.length) {
            return -1
        }

        if (needle.isEmpty() || haystack.contentEquals(needle)) {
            return 0
        }

        for (i in 0..haystack.length - needle.length) {
            while (count != needle.length) {
                if (needle[count] == haystack[i + count]) {
                    count++
                } else {
                    count = 0
                    break
                }
            }
            if (count == needle.length) {
                index = i
                break
            }
        }

        return index
    }

}