package linkedList

class RemoveNthNodeFromEnd {

    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var cur = head
        var count = n + 1
        var preNFromEnd = head

        while (count != 0 && cur != null) {
            cur = cur.next
            count--
        }

        if (count == 1) {
            preNFromEnd = head!!.next
            return preNFromEnd
        }

        while (cur != null) {
            cur = cur.next
            preNFromEnd = preNFromEnd!!.next

        }

        preNFromEnd!!.next = preNFromEnd.next!!.next

        return head
    }

}