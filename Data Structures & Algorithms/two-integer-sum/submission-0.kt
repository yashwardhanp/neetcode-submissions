class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val inputs = HashMap<Int, Int>()
        
        nums.forEachIndexed{ index, num ->
            val otherNum = target - num
            //check if other num is present in inputs. If present, pair found.
            // since we are adding items to inputs after this check, the otherNum's
            // index will be greater than index
            if(inputs.containsKey(otherNum)){
                return intArrayOf(inputs[otherNum] ?: -1, index)
            }
            inputs[num] = index
        }

        return intArrayOf(-1, -1)

    }
}
