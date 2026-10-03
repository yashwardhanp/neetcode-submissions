class Solution {
    fun maxProfit(prices: IntArray): Int {
        if(prices.isEmpty()) return 0

        var profit = 0
        var minBuyingPrice = prices[0]

        for (i in 1 until prices.size) {
            val currentPrice = prices[i]
            val currentDiff = currentPrice - minBuyingPrice
            when {
                currentDiff > profit -> profit = currentDiff
                currentPrice < minBuyingPrice -> minBuyingPrice = currentPrice
            }
        }
        return profit
    }
}
