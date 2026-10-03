class Solution {
    fun isPalindrome(s: String): Boolean {
            var head = 0
            var tail = s.length - 1

            var result = true

            while(head < tail) {
                val start = s[head]
                val end = s[tail]

                var skip = false
                
                // skip start if not alphanumeric
                if(!start.isLetterOrDigit()){
                    head++
                    skip = true
                }

                // skip end if not alphanumeric
                if(!end.isLetterOrDigit()){
                    tail--
                    skip = true
                }

                // skip if required
                if(skip) continue

                // if start and end are different, exit loop and set result to
                // false
                if(!start.equals(end, ignoreCase = true)){
                    result = false
                    break
                }

                // move both pointers
                head++
                tail--
            }

            return result
    }
}
