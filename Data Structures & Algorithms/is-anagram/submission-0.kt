class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false
        val frequency = HashMap<Char, Int>()

        for (i in 0 until s.length){
            val char = s[i]
            frequency[char] = frequency.getOrPut(char) {0} + 1
        }

        for (i in 0 until t.length){
            val char = t[i]
            frequency[char] = frequency.getOrPut(char) {0} - 1
        }

        frequency.values.forEach { value ->
        if(value != 0) return false
        }

        return true

    }
}
