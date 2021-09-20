fun main(){
    val scores= arrayOf(20,43,45,49)

    var lowest=scores[0]
    for (score in scores){
        if (score<lowest) lowest=score
    }
    println(lowest)
}