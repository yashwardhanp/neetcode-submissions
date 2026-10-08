class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1
        while(left <= right) {
            val mid = (left+right)/2
            val current = nums[mid]
            when{
                current == target -> return mid
                current > target -> right = mid-1
                current < target -> left = mid+1
            }
        }
        return -1
    }
}
