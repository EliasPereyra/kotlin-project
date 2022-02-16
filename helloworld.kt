package org.kotling.play

fun multiply (x: Int, y: Int) = x * y

fun describeString(maybeString: String?): String {
  if (maybeString != null && maybeString.length > 0) {
    return "String of length $maybeString"
  } else {
    return "Empty or null string"
  }
}
fun main() {
  infix fun Int.times(str: String) = str.repeat(this)

  describeString(null)
}
