enum class Letter(val smallLetter: Char) {
    A('a'),
    B('b'),
    C('c'),
}

fun main() {
    println(Letter.A.smallLetter)
}
