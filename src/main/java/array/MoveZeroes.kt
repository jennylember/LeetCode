package array

class MoveZeroes {

    fun moveZeroes(nums: IntArray) {
        val nums2: IntArray = nums.copyOf()
        var count = 0
        var indexer = 0

        for (i in nums2.indices) {
            if (nums2[i] == 0) {
                count++
                nums[nums.size - count] = 0
            } else {
                nums[indexer] = nums2[i]
                indexer++
            }
        }
    }

    fun moveZeroes2(nums: IntArray) {
        var countNull = 0
        var countNotNull = 0

        for (i in nums.indices) {
            if (nums[i] != 0) {
                nums[countNotNull] = nums[i]
                countNotNull++
            } else {
                countNull++
            }
        }

        for (i in countNull downTo 1) {
            nums[nums.size - i] = 0
        }


    }




}