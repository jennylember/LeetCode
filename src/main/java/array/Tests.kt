package array

fun main() {

    println("Hello LeetCode!")
    println("Chapter: Array.")

    val nums: IntArray = intArrayOf(9, 9, 9)
    val nums2: IntArray = intArrayOf(1, 1)

    // task 1
    val removeDuplicates = RemoveDuplicates()
    println("Length = ${removeDuplicates.removeDuplicates(nums)}")
    println("Length = ${removeDuplicates.removeDuplicates2(nums)}")
    println("Length = ${removeDuplicates.removeDuplicates3(nums)}")

    // task 2
    val bestTimeToBuy = BestTimeToBuy()
    println("Max Profit = ${bestTimeToBuy.maxProfit(nums)}")

    //task 3
    val rotateArray = RotateArray()
    rotateArray.rotate(nums, 3)

    //task 4
    val containsDuplicate = ContainsDuplicate()
    println("Answer1: ${containsDuplicate.containsDuplicate1(nums)}")
    println("Answer2: ${containsDuplicate.containsDuplicate2(nums)}")
    println("Answer3: ${containsDuplicate.containsDuplicate3(nums)}")
    println("Answer4: ${containsDuplicate.containsDuplicate4(nums)}")

    //task 5
    val single = SingleElement()
    println("Answer: ${single.singleNumber(nums)}")

    //task 6
    val intersectionTwoArrays = IntersectionTwoArrays()
    intersectionTwoArrays.intersect(nums, nums2)

    // task 7
    val plusOne = PlusOne()
    plusOne.plusOne2(nums)

    // task 8
    val moveZeroes = MoveZeroes()
    moveZeroes.moveZeroes2(nums)

    // task 9
    val twoSum = TwoSum()
    twoSum.twoSum2(nums, 6)

}