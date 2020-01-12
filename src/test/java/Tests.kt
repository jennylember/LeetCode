import dynamic.BestTimeToBuy
import dynamic.HouseRobber
import linkedList.ListNode
import linkedList.RemoveNthNodeFromEnd
import math.CountPrimes
import math.FizzBuzz
import math.PowerOfThree
import math.RomanToInteger
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import sortAndSearch.FirstBadVersion
import sortAndSearch.MergeSortedArray
import string.LongestCommonPrefix
import string.StringToInteger

class Tests {

    lateinit var stringToInteger: StringToInteger
    lateinit var longestCommonPrefix: LongestCommonPrefix
    lateinit var mergeSortedArray: MergeSortedArray
    lateinit var firstBadVersion: FirstBadVersion
    lateinit var fizzBuzz: FizzBuzz
    lateinit var countPrimes: CountPrimes
    lateinit var powerOfThree: PowerOfThree
    lateinit var romanToInteger: RomanToInteger
    lateinit var bestTimeToBuy: BestTimeToBuy
    lateinit var houseRobber: HouseRobber
    lateinit var removeNthNodeFromEnd: RemoveNthNodeFromEnd

    @BeforeEach
    fun init() {
        stringToInteger = StringToInteger()
        longestCommonPrefix = LongestCommonPrefix()
        mergeSortedArray = MergeSortedArray()
        firstBadVersion = FirstBadVersion()
        fizzBuzz = FizzBuzz()
        countPrimes = CountPrimes()
        powerOfThree = PowerOfThree()
        romanToInteger = RomanToInteger()
        bestTimeToBuy = BestTimeToBuy()
        houseRobber = HouseRobber()
        removeNthNodeFromEnd = RemoveNthNodeFromEnd()

    }

    @Test
    fun testMyAtoi() {
        Assertions.assertEquals(3, stringToInteger.myAtoi("3.999"))
        Assertions.assertEquals(0, stringToInteger.myAtoi("+"))
        Assertions.assertEquals(0, stringToInteger.myAtoi("-"))
        Assertions.assertEquals(1, stringToInteger.myAtoi("+1"))
        Assertions.assertEquals(0, stringToInteger.myAtoi(""))
        Assertions.assertEquals(0, stringToInteger.myAtoi("+-6432"))
        Assertions.assertEquals(-47, stringToInteger.myAtoi("-47-"))
        Assertions.assertEquals(+7548, stringToInteger.myAtoi("+7548+"))
        Assertions.assertEquals(2147483647, stringToInteger.myAtoi("987654345677"))
        Assertions.assertEquals(-2147483648, stringToInteger.myAtoi("-987463473747"))
        Assertions.assertEquals(0, stringToInteger.myAtoi("wofrj 8667"))
        Assertions.assertEquals(-47, stringToInteger.myAtoi("       -47  jjjfhhh 8667"))
        Assertions.assertEquals(0, stringToInteger.myAtoi("wofrj 8667"))
    }

    @Test
    fun testLongestCommonPrefix() {
        Assertions.assertEquals("flo", longestCommonPrefix.longestCommonPrefix(arrayOf<String>("flower", "flown", "flock") ))
        Assertions.assertEquals("", longestCommonPrefix.longestCommonPrefix(arrayOf<String>("") ))
        Assertions.assertEquals("aa", longestCommonPrefix.longestCommonPrefix(arrayOf<String>("aa","aa") ))
    }

    @Test
    fun testMergeSortedArray() {

        Assertions.assertArrayEquals(intArrayOf(1, 1, 2, 3), mergeSortedArray.merge(intArrayOf(2, 3, 0, 0), 2, intArrayOf(1, 1), 2))
        Assertions.assertArrayEquals(intArrayOf(1, 2), mergeSortedArray.merge(intArrayOf(2, 0), 1, intArrayOf(1), 1))
        Assertions.assertArrayEquals(intArrayOf(1), mergeSortedArray.merge(intArrayOf(0), 0, intArrayOf(1), 1))
        Assertions.assertArrayEquals(intArrayOf(2, 3, 6), mergeSortedArray.merge(intArrayOf(2, 3, 6), 3, intArrayOf(), 0))
        Assertions.assertArrayEquals(intArrayOf(1, 2, 5, 6, 8, 9, 10), mergeSortedArray.merge(intArrayOf(1, 8, 9, 10, 0, 0, 0), 4, intArrayOf(2, 5, 6), 3))
        Assertions.assertArrayEquals(intArrayOf(1, 1, 2, 3, 5, 6), mergeSortedArray.merge(intArrayOf(1, 2, 3, 0, 0, 0), 3, intArrayOf(1, 5, 6), 3))


    }

    @Test
    fun testFirstBadVersion() {
        Assertions.assertEquals(5, firstBadVersion.firstBadVersion(booleanArrayOf(false, false, false, false, false, true, true), 6))
        Assertions.assertEquals(1, firstBadVersion.firstBadVersion(booleanArrayOf(false, true), 1))
        Assertions.assertEquals(2, firstBadVersion.firstBadVersion(booleanArrayOf(false, false, true), 2))
        Assertions.assertEquals(1, firstBadVersion.firstBadVersion(booleanArrayOf(false, true, true, true), 3))
        Assertions.assertEquals(5, firstBadVersion.firstBadVersion(booleanArrayOf(false, false, false, false, false, true), 5))

    }

    @Test
    fun testFizzBuzz() {
        Assertions.assertLinesMatch( arrayListOf<String>("1", "2", "Fizz", "4", "Buzz"), fizzBuzz.fizzBuzz(5))
        Assertions.assertLinesMatch( arrayListOf<String>("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"), fizzBuzz.fizzBuzz(15))
    }

    @Test
    fun testCountPrimes() {
      Assertions.assertEquals(4, countPrimes.countPrimes(10))
      Assertions.assertEquals(0, countPrimes.countPrimes(2))
      Assertions.assertEquals(8, countPrimes.countPrimes(20))
      Assertions.assertEquals(4, countPrimes.countPrimes2(10))
      Assertions.assertEquals(0, countPrimes.countPrimes2(2))
      Assertions.assertEquals(8, countPrimes.countPrimes2(20))
      Assertions.assertEquals(320350, countPrimes.countPrimes2(4567832))
    }

    @Test
    fun testPowerOfTree2() {
        Assertions.assertEquals(true, powerOfThree.isPowerOfThree2(81))
        Assertions.assertEquals(true, powerOfThree.isPowerOfThree2(27))
        Assertions.assertEquals(false, powerOfThree.isPowerOfThree2(45))
        Assertions.assertEquals(true, powerOfThree.isPowerOfThree2(9))
        Assertions.assertEquals(false, powerOfThree.isPowerOfThree2(45))
        Assertions.assertEquals(true, powerOfThree.isPowerOfThree2(3))
        Assertions.assertEquals(true, powerOfThree.isPowerOfThree2(1))
        Assertions.assertEquals(false, powerOfThree.isPowerOfThree2(0))
        Assertions.assertEquals(true, powerOfThree.isPowerOfThree2(59049))
        Assertions.assertEquals(true, powerOfThree.isPowerOfThree2(1162261467))
    }

    @Test
    fun testPowerOfTree() {
        Assertions.assertEquals(true, powerOfThree.isPowerOfThree(81))
        Assertions.assertEquals(true, powerOfThree.isPowerOfThree(27))
        Assertions.assertEquals(false, powerOfThree.isPowerOfThree(45))
        Assertions.assertEquals(true, powerOfThree.isPowerOfThree(9))
        Assertions.assertEquals(false, powerOfThree.isPowerOfThree(45))
        Assertions.assertEquals(true, powerOfThree.isPowerOfThree(3))
        Assertions.assertEquals(true, powerOfThree.isPowerOfThree(1))
        Assertions.assertEquals(false, powerOfThree.isPowerOfThree(0))
        Assertions.assertEquals(true, powerOfThree.isPowerOfThree(59049))
        Assertions.assertEquals(true, powerOfThree.isPowerOfThree(1162261467))
    }

    @Test
    fun testRomanToInteger() {
        Assertions.assertEquals(11, romanToInteger.romanToInt("XI"))
        Assertions.assertEquals(19, romanToInteger.romanToInt("XIX"))
        Assertions.assertEquals(400, romanToInteger.romanToInt("CD"))
        Assertions.assertEquals(900, romanToInteger.romanToInt("CM"))
        Assertions.assertEquals(40, romanToInteger.romanToInt("XL"))
        Assertions.assertEquals(90, romanToInteger.romanToInt("XC"))
        Assertions.assertEquals(3, romanToInteger.romanToInt("III"))
        Assertions.assertEquals(4, romanToInteger.romanToInt("IV"))
        Assertions.assertEquals(9, romanToInteger.romanToInt("IX"))
        Assertions.assertEquals(58, romanToInteger.romanToInt("LVIII"))
        Assertions.assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"))
        Assertions.assertEquals(1695, romanToInteger.romanToInt("MDCXCV"))
    }

    @Test
    fun testBestTimeToBuy() {
        Assertions.assertEquals(5, bestTimeToBuy.maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)))
        Assertions.assertEquals(5, bestTimeToBuy.maxProfit(intArrayOf(7, 3, 8, 4, 1, 2)))
        Assertions.assertEquals(0, bestTimeToBuy.maxProfit(intArrayOf(7, 6, 4, 3, 1)))
        Assertions.assertEquals(0, bestTimeToBuy.maxProfit(intArrayOf()))
        Assertions.assertEquals(4, bestTimeToBuy.maxProfit(intArrayOf(3, 3, 5, 0, 0, 3, 1, 4)))
    }

    @Test
    fun testHouseRobber() {
        Assertions.assertEquals(27, houseRobber.rob(intArrayOf(0, 2, 5, 1, 1, 9, 2, 13)))
        Assertions.assertEquals(4, houseRobber.rob(intArrayOf(1, 2, 3, 1)))
        Assertions.assertEquals(12, houseRobber.rob(intArrayOf(2, 7, 9, 3, 1)))
    }

    @Test
    fun testRemoveNthNodeFromEnd() {

        val head = ListNode(10).apply {
            next = ListNode(5).apply {
                next = ListNode(4).apply {
                    next = ListNode(666). apply {
                        next = ListNode(1)
                    }
                }
            }
        }

        val head2 = ListNode(10).apply {
            next = ListNode(5).apply {
                next = ListNode(4).apply {
                    next = ListNode(1)
                }
            }
        }

//       Assertions.assertEquals(head2, removeNthNodeFromEnd.removeNthFromEnd(head, 2))

//        val head3 = ListNode(1).apply {
//            next = ListNode(2)
//        }
        val head4 = ListNode(1)

        Assertions.assertEquals(0, removeNthNodeFromEnd.removeNthFromEnd(head4, 1))

    }




}