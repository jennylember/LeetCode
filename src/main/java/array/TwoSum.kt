package array

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val indices: IntArray = intArrayOf(0, 0)
        for (i in nums.indices) {
            for (j in nums.indices) {
                if ((nums[i] + nums[j]) == target && i != j) {
                    indices[0] = j
                    indices[1] = i
                }
            }
        }
        return indices
    }

    fun twoSum2(nums: IntArray, target: Int): IntArray {
        val map: HashMap<Int, Int> = hashMapOf()
        val indices: IntArray = intArrayOf(0, 0)
        var value: Int

        for (i in nums.indices) {
            map[nums[i]] = i
        }

        for (i in nums.indices) {
            value = target - nums[i]
            if (map.containsKey(value) && map.getValue(value) != i) {
                indices[0] = i
                indices[1] = map.getValue(value)
                break
            }
        }
        return indices
    }

}