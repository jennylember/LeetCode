package array

class IntersectionTwoArrays {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val outIntArray = arrayListOf<Int>()
        val map: HashMap<Int, Int> = hashMapOf()
        var value: Int

        if (nums1.size > nums2.size) {
            for (i in nums1.indices) {
                if (map.containsKey(nums1[i])) {
                    value = map[nums1[i]]!!
                    value++
                    map[nums1[i]] = value
                } else {
                    map[nums1[i]] = 1
                }
            }

            for (i in nums2.indices) {
                if (map.containsKey(nums2[i]) && map[nums2[i]] != 0) {
                    outIntArray.add(nums2[i])
                    value = map[nums2[i]]!!
                    value--
                    map[nums2[i]] = value
                }
            }
        } else {
            for (i in nums2.indices) {
                if (map.containsKey(nums2[i])) {
                    value = map[nums2[i]]!!
                    value++
                    map[nums2[i]] = value
                } else {
                    map[nums2[i]] = 1
                }
            }

            for (i in nums1.indices) {
                if (map.containsKey(nums1[i]) && map[nums1[i]] != 0) {
                    outIntArray.add(nums1[i])
                    value = map[nums1[i]]!!
                    value--
                    map[nums1[i]] = value
                }
            }


        }
        return outIntArray.toIntArray()
    }
}