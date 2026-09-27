class Solution {
    val existingValues = mutableSetOf<Int>()
    fun hasDuplicate(nums: IntArray): Boolean {
        nums.forEach{ num -> 
            if (existingValues.contains(num)){
                return true
            }
            existingValues.add(num)
        }
        return false
    }
}
