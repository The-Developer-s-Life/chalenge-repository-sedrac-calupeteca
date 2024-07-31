fun numberValid(number: String): Boolean = "9[1235][0-9]{7}|(999|900|909)[0-9]{6}".toRegex() matches number

fun main() = println(numberValid("909269780"))