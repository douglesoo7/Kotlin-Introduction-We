fun main() {
    val num = 125
    if (checkDivisibility(num))
        println("Yes")
    else
        println("No")
}

fun checkDivisibility(num: Int): Boolean {
    return num%5==0
}