package array

class SingleElement {

    fun singleNumber(nums: IntArray): Int {
        var sum = 0
        for(i in nums.indices) {
            sum = nums[i] xor sum
        }
        return sum
    }
}