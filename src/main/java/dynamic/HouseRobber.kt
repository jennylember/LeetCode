package dynamic

import kotlin.math.max

class HouseRobber {
    fun rob2(nums: IntArray): Int {

        if (nums.isEmpty()) {
            return 0
        }

        var maxProfit = 0
        var prev = nums[0]
        var indexPrev = 0
        var sum = false
        var index = 1

        while (index < nums.size) {
            if (nums[index] > prev && index - indexPrev == 1) {
                if (sum) {
                    maxProfit -= prev
                }
                prev = nums[index]
                indexPrev = index
                maxProfit += prev
                sum = true
            } else {
                if (sum) {
                    index++
                }
                prev = nums[index]
                indexPrev = index
                sum = false
            }
            index++
        }

        if (!sum) {
            maxProfit += prev
        }

        return maxProfit
    }

    fun rob3(nums: IntArray): Int {

        if (nums.isEmpty()) {
            return 0
        }
        val list = nums.copyOf().toMutableList()

        var maxElement: Int
        var maxIndex: Int

        var sum = 0

        while (list.size > 0) {
            maxElement = list.max()!!
            maxIndex = list.indexOf(maxElement)
            sum += maxElement
            if (maxIndex < list.size - 1) {
                list.removeAt(maxIndex + 1)
            }
            list.removeAt(maxIndex)
            if (maxIndex != 0) {
                list.removeAt(maxIndex - 1)
            }
        }




        return sum
    }

    fun rob(nums: IntArray): Int {

        if (nums.isEmpty()) {
            return 0
        }

        if (nums.size == 1) {
            return nums[0]
        }

        var pre1 = nums[0]
        var pre2 = Math.max(nums[0], nums[1])
        for (i in 2 until nums.size) {
            var cur = Math.max(nums[i] + pre1, pre2)
            pre1 = pre2
            pre2 = cur
        }

        return pre2
    }
}