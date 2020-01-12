package string

import java.util.*
import kotlin.collections.LinkedHashMap

class FirstUniqueChar {
    fun firstUniqChar(s: String): Int {
        var first = -1
        if (s.isEmpty()) {
            return -1
        }
        val map = HashMap<Char, Int>()

        for (i in s.indices) {
            if (map.containsKey(s[i])) {
                map[s[i]] = map[s[i]]!!.plus(1)
            } else {
                map[s[i]] = 1
            }
        }

        val result = map.minBy { (k, v) -> v }

        for (i in s.indices) {
            if (map[s[i]] == 1) {
                first = i
                break
            }
        }
        return first
    }

    fun firstUniqChar2(s: String): Int {
        if (s.isEmpty()) {
            return -1
        }
        val map = LinkedHashMap<Char, Int>()

        for (i in s.indices) {
            if (map.containsKey(s[i])) {
                map[s[i]] = -1
            } else {
                map[s[i]] = i
            }
        }

        return map
            .filter { it.value != -1 }
            .minBy { (_, v) -> v }?.value ?: -1


    }
}