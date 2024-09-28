fun consumeAny(any: Any) {}

fun consumeNumber(number: Number) {}

fun main() {
    val i: Int = 120
    val l: Long = 1234567890L
    val d: Double = 10.0
    consumeAny(i) // upcasting Int to Any
    consumeAny(l) // upcasting Long to Any
    consumeAny(d) // upcasting Double to Any
    consumeNumber(i) // upcasting Int to Number
    consumeNumber(l) // upcasting Long to Number
    consumeNumber(d) // upcasting Double to Number
}
