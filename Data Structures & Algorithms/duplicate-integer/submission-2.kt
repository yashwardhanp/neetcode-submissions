class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val existingValues = mutableSetOf<Int>()
        nums.forEach{ num -> 
            if (existingValues.contains(num)){
                return true
            }
            existingValues.add(num)
        }
        return false
    }
}
