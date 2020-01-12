package dynamic

class BestTimeToBuy {
    fun maxProfit(prices: IntArray): Int {
        if (prices.isEmpty()) {
            return 0
        }

        var indexBestPriceToBuy = 0
        var bestPriceToBuy = prices[indexBestPriceToBuy]
        var indexBestTimeToSell = prices.size - 1
        var bestPriceToSell = prices[indexBestTimeToSell]
        var profit = 0
        var maxProfit = bestPriceToSell - bestPriceToBuy
        if (maxProfit < 0) {
            maxProfit = 0
        }


        for (index in 1 until prices.size) {
            if (prices[index] < bestPriceToBuy && index > indexBestPriceToBuy) {
                bestPriceToBuy = prices[index]
                indexBestPriceToBuy = index
            } else {
                if (index > indexBestPriceToBuy) {
                    bestPriceToSell = prices[index]
                    indexBestTimeToSell = index
                }
            }

            if (indexBestTimeToSell > indexBestPriceToBuy) {
                profit = bestPriceToSell - bestPriceToBuy

                if (profit > maxProfit) {
                    maxProfit = profit
                }
            }


        }

        return maxProfit
    }
}