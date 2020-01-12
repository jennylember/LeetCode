package array

class RemoveDuplicates {

    fun removeDuplicates(nums: IntArray): Int {
        var length = nums.size

        for (i in nums.indices) {
            if (i != nums.lastIndex) {
                if (nums[i] == nums[i + 1])
                    length--
            }
        }
        for (i in nums.indices) {
            if (i != nums.lastIndex) {
                if (nums[i] == nums[i + 1]) {
                    var j = i
                    while (j < nums.size - 2) {
                        nums[j + 1] = nums[j + 2]
                        j++
                    }
                }
            }
            println("point")
        }
        return length
    }

    fun removeDuplicates2(nums: IntArray): Int {
        var length = nums.size

        var dup = 0
        var j = 0
        var i = 0

        while (j + 1 < nums.size && i < nums.size) {
            while (j + 1 < nums.size && nums[j + 1] == nums[i]) {
                dup++
                j++
            }
            length -= dup
            dup = 0
            // сдвиг массива
            if (j + 1 < nums.size) {
                nums[i + 1] = nums[j + 1]
            }
            j++
            i++
        }
        return length
    }

    fun removeDuplicates3(nums: IntArray): Int {

        var uniq = 0


        for (i in 0 until nums.size - 1) {
            if (nums[i] != nums [i + 1]) {
                uniq++
                nums[uniq] = nums[i + 1]
            }
        }
        return uniq + 1
    }
}