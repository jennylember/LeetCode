package array

class RotateArray {

    fun rotate(nums: IntArray, k: Int) {
        val nums2: IntArray = nums.copyOf()
        var countRotate = k % nums.size
        var count = 0
        for (i in nums.indices) {
            if (countRotate > 0) {
                nums[i] = nums[nums.size - countRotate]
                countRotate--
            } else {
                nums[i] = nums2[count]
                count++
            }
        }
    }

}