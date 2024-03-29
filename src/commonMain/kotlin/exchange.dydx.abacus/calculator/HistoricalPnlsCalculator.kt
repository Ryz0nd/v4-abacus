package exchange.dydx.abacus.calculator

import exchange.dydx.abacus.protocols.ParserProtocol

internal class HistoricalPnlsCalculator {
    companion object {
        fun sum(
            parser: ParserProtocol,
            pnl1: Map<String, Any>?,
            pnl2: Map<String, Any>?,
            createdAtMilliseconds: Double
        ): Map<String, Any> {
            val historicalPnl = mutableMapOf<String, Any>()
            historicalPnl["createdAtMilliseconds"] = createdAtMilliseconds
            historicalPnl["equity"] = (
                parser.asDouble(pnl1?.get("equity"))
                    ?: 0.0
                ) + (parser.asDouble(pnl2?.get("equity")) ?: 0.0)
            historicalPnl["totalPnl"] = (
                parser.asDouble(pnl1?.get("totalPnl"))
                    ?: 0.0
                ) + (parser.asDouble(pnl2?.get("totalPnl")) ?: 0.0)
            historicalPnl["netTransfers"] = (
                parser.asDouble(pnl1?.get("netTransfers"))
                    ?: 0.0
                ) + (parser.asDouble(pnl2?.get("netTransfers")) ?: 0.0)
            return historicalPnl
        }

        fun sum(
            parser: ParserProtocol,
            subaccount1: List<Map<String, Any>>?,
            subaccount2: List<Map<String, Any>>?
        ): List<Map<String, Any>>? {
            val array1 = subaccount1 ?: return subaccount2
            val array2 = subaccount2 ?: return subaccount1

            var previousPnl1: Map<String, Any>? = null
            var previousPnl2: Map<String, Any>? = null
            var index1 = 0
            var index2 = 0

            val result = mutableListOf<Map<String, Any>>()
            while (index1 < subaccount1.size && index2 < subaccount2.size) {
                /*
                val equity: Double,
                val totalPnl: Double,
                val netTransfers: Double,
                val createdAtMilliseconds: Double,
                 */
                val historicalPnl1 = subaccount1[index1]
                val historicalPnl2 = subaccount2[index2]

                val timeStamp1 = parser.asDouble(historicalPnl1["createdAtMilliseconds"])
                val timeStamp2 = parser.asDouble(historicalPnl2["createdAtMilliseconds"])
                if (timeStamp1 != null && timeStamp2 != null) {
                    if (timeStamp1 < timeStamp2) {
                        result.add(sum(parser, historicalPnl1, previousPnl2, timeStamp1))
                        index1++
                        previousPnl1 = historicalPnl1
                    } else if (timeStamp1 > timeStamp2) {
                        result.add(sum(parser, historicalPnl2, previousPnl1, timeStamp1))
                        index2++
                        previousPnl2 = historicalPnl2
                    } else {
                        result.add(sum(parser, historicalPnl1, historicalPnl2, timeStamp1))
                        index1++
                        index2++
                        previousPnl1 = historicalPnl1
                        previousPnl2 = historicalPnl2
                    }
                }
            }

            while (index1 < subaccount1.size) {
                val historicalPnl = subaccount1[index1]

                val timeStamp = parser.asDouble(historicalPnl["createdAtMilliseconds"])
                if (timeStamp != null) {
                    result.add(sum(parser, historicalPnl, previousPnl2, timeStamp))
                    index1++
                }
            }
            while (index2 < subaccount2.size) {
                val historicalPnl = subaccount2[index2]

                val timeStamp = parser.asDouble(historicalPnl["createdAtMilliseconds"])
                if (timeStamp != null) {
                    result.add(sum(parser, historicalPnl, previousPnl1, timeStamp))
                    index2++
                }
            }
            return result
        }

        fun sum(
            parser: ParserProtocol,
            subaccounts: List<List<Map<String, Any>>>?,
        ): List<Map<String, Any>>? {
            val lists = subaccounts ?: return null

            // Use divide-and-conquer to merge all subaccounts
            // Final complexity is O(n * log(k)) where n is the total number of historicalPnls, and k is the total number of subaccounts

            return when (lists.size) {
                0 -> null
                1 -> lists[0]
                2 -> sum(parser, lists[0], lists[1])
                else -> {
                    val mid = lists.size / 2
                    val left = sum(parser, lists.subList(0, mid))
                    val right = sum(parser, lists.subList(mid, lists.size))
                    sum(parser, left, right)
                }
            }
        }
    }
}
