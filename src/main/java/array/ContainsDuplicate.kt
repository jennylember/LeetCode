package array

class ContainsDuplicate {

    fun containsDuplicate1(nums: IntArray): Boolean {
        var containsDuplicate = false
        for (i in nums.indices) {
            for (j in nums.indices) {
                if (nums[i] == nums [j] && i != j) {
                    containsDuplicate = true
                }
            }
        }
        return containsDuplicate
    }

    fun containsDuplicate2(nums: IntArray): Boolean {
        var containsDuplicate = false
        nums.sort()
        for (i in 0 until nums.size - 1) {
            if (nums[i] == nums[i + 1]) {
                containsDuplicate = true
            }
        }
        return containsDuplicate
    }

    fun containsDuplicate3(nums: IntArray): Boolean {
        var containsDuplicate = false
        val set = mutableSetOf<Int>()

        for (i in nums.indices) {
            set.add(nums[i])
        }
        if (set.size != nums.size) {
            containsDuplicate = true
        }

        return containsDuplicate

    }

    fun containsDuplicate4(nums: IntArray): Boolean {
        var containsDuplicate = false
        val set = hashSetOf<Int>()

        for (i in nums.indices) {
            if (set.contains(nums[i])) {
                containsDuplicate = true
                break
            }
            else {
                set.add(nums[i])
            }
        }

        return containsDuplicate

    }




}