class Solution {
    fun climbStairs(n: Int): Int {
        var map =  HashMap<Int, Int>()
        map.put(1, 1)
        map.put(2, 2)
        if (n <= 2) return map.get(n)!!
        for (i in 3..n ) {
            map.put(i, map.getOrDefault(i-1,0)+ map.getOrDefault(i-2,0))
        }
        return map.getOrDefault(n,0)
    }

}

// 1까지 가는법 : 1 = 1개
// 2까지 가는법 : 1 -> 1, 2 = 2개
// 3까지 가는법 : 1-> 2, 2 -> 1 = 3개
// 4까지 가는법 : 2 -> 2, 3 -> 1 = 5
// 5까지 가는법 : 3 -> 2, 4 -> 1
// n까지 가는법 : n-2 ->2, n-1 -> 1