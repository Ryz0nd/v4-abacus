package exchange.dydx.abacus.processor.router

import exchange.dydx.abacus.processor.base.BaseProcessor
import exchange.dydx.abacus.protocols.ParserProtocol

sealed class RouterProcessor(parser: ParserProtocol) {
    class SquidProcessor()
    class SkipProcessor()
}