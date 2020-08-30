fun main() {
    var myTeam = arrayOf("yaseen","ahmed","omar","ziad");
    println("team members:");
    for((index,value) in myTeam.withIndex())
        println("the member in the index $index is $value");
}