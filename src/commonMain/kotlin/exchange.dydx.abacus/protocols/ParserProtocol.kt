package exchange.dydx.abacus.protocols
import com.ionspin.kotlin.bignum.decimal.BigDecimal
import exchange.dydx.abacus.utils.IList
import exchange.dydx.abacus.utils.IMap
import kotlinx.datetime.Instant

interface ParserProtocol {
    // parse a field to string
    fun asString(data: Any?): String?

    // parse a field to string
    fun asStrings(data: Any?): IList<String>?

    // parse  a field to double
    fun asDouble(data: Any?): Double?

    // parse  a field to BigDecimal
    fun asDecimal(data: Any?): BigDecimal?

    // parse  a field to int
    fun asInt(data: Any?): Int?

    // parse  a field to int
    fun asLong(data: Any?): Long?

    // parse  a field to boolean
    fun asBool(data: Any?): Boolean?

    // parse a field to a date int
    fun asDatetime(data: Any?): Instant?

    // parse a field to a map
    fun asMap(data: Any?): IMap<String, Any>?

    fun asNativeMap(data: Any?): Map<String, Any>?

    // parse to a list
    fun asList(data: Any?): IList<Any>?

    fun asNativeList(data: Any?): List<Any>?

    fun value(data: Any?, path: String): Any?

    fun decodeJsonObject(text: String?): IMap<String, Any>?
    fun decodeJsonArray(text: String?): IList<Any>?
}
