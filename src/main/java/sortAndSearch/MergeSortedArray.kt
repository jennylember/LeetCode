package sortAndSearch

class MergeSortedArray {

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): IntArray {

        var n2 = n - 1
        var m2 = m - 1
        var current = m + n - 1
        while (current > -1) {

            while (m2 > -1 && n2 > -1) {
                if (nums1[m2] < nums2[n2]) {
                    nums1[current] = nums2[n2]
                    n2--
                    current--
                } else {
                    nums1[current] = nums1[m2]
                    current--
                    m2--
                }

            }
            if (n2 != -1) {
                nums1[current] = nums2[n2]
                n2--
                current--
            }

            if (m2 != -1) {
                current--
            }


        }
        return nums1
    }


}
