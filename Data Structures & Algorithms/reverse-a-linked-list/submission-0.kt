/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        var prevNode: ListNode? = null
        var currNode: ListNode? = head
        while(currNode?.next != null){
            val tempNode = currNode.next
            currNode.next = prevNode
            prevNode = currNode
            currNode = tempNode
        }
        currNode?.next = prevNode
        return currNode
    }
}
