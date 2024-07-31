fun numberValid(number: String): Boolean = "9[12345][0-9]{7}|99[1-8][0-9]{6}".toRegex() matches number

fun main() = println(numberValid("998269780"))