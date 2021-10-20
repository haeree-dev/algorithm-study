class Solution {
    fun getSum(a: Int, b: Int): Int {
        if (a == 0) return b
        if (b == 0) return a

        var sum = a
        var carry = b

        while (carry > 0) {
            var c = sum
            var d = carry

            sum =  c xor d
            carry = ( c and d ) shl 1
        }

        return sum + carry

    }
}