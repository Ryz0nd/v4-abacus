/**
 * Indexer API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.0.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package indexer.codegen

import kotlinx.serialization.Serializable

/**
 *
 * Values: LIMIT,MARKET,STOPLIMIT,STOPMARKET,TRAILINGSTOP,TAKEPROFIT,TAKEPROFITMARKET
 */
@Serializable
enum class IndexerOrderType(val value: kotlin.String) {
    LIMIT("LIMIT"), // :/
    MARKET("MARKET"), // :/
    STOPLIMIT("STOP_LIMIT"), // :/
    STOPMARKET("STOP_MARKET"), // :/
    TRAILINGSTOP("TRAILING_STOP"), // :/
    TAKEPROFIT("TAKE_PROFIT"), // :/
    TAKEPROFITMARKET("TAKE_PROFIT_MARKET"); // :/
}
