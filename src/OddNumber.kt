fun main(){
    val num=15
    if (oddNum(num)) println("Odd Number")
}

fun oddNum(num: Int): Boolean {
    return num%2!=0
}