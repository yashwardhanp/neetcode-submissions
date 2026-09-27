class Solution {
    val existingValues = HashMap<Int, Boolean>()
    fun hasDuplicate(nums: IntArray): Boolean {
        nums.forEach{ num -> 
            if (existingValues[num] == true){
                return true
            }
            existingValues[num] = true
        }
        return false
    }
}
