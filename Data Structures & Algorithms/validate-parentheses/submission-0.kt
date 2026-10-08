class Solution {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()

        for(i in 0 until s.length){
            if(stack.isEmpty()){
                stack.push(s[i])
            } else {
                if(pairFound(stack.peek(), s[i])){
                    stack.pop()
                } else {
                    stack.push(s[i])
                }
            }
        }
        return stack.isEmpty()
    }

    private fun pairFound(parantheses1: Char?, parantheses2: Char?): Boolean{
        return when(parantheses1){
            '(' -> parantheses2 == ')'
            '{' -> parantheses2 == '}'
            '[' -> parantheses2 == ']'
            else -> false
        }
    }
}

class Stack<T> {
    private val storage = ArrayDeque<T>()

    fun push(element: T) {
        storage.addLast(element)
    }

    fun pop(): T? {
        return storage.removeLast()
    }

    fun peek(): T? {
        return storage.peekLast()
    }

    val size: Int
        get() = storage.size

    fun isEmpty(): Boolean = storage.isEmpty()
}
