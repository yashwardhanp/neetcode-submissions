/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        when{
            list1 == null -> return list2
            list2 == null -> return list1
        }

        var firstList: ListNode? = list1
        var secondList: ListNode? = list2
        
        val finalHead: ListNode
            if(list1.`val` <= list2.`val`){ 
                finalHead = list1.also{ firstList = it.next}
            } else {
                finalHead = list2.also{ secondList = it.next}
            }

        var mergedList: ListNode? = finalHead

        while(firstList != null || secondList != null) {
            when{
                firstList == null -> {
                    mergedList?.next = secondList
                    break
                }
                secondList == null -> {
                    mergedList?.next = firstList
                    break
                }
                else -> {
                    mergedList?.next = if(firstList.`val` <= secondList.`val`){ firstList.also{ firstList = it.next}} else {secondList.also{ secondList = it.next}}
                }
            }
            mergedList = mergedList?.next
        }

        return finalHead
        
    }
}
