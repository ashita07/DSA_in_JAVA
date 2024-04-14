open class Person(age: Int,name:String) {
    init{
        println("My name is $name")
        println("My age is $age")
    }
}
class MathTeacher(age:Int , name:String): Person(age,name){
    fun teachMaths(){
        println("I teach in primary school")
    }
}
class Cricketer(age:Int,name:String):Person(age,name){
    fun playCricket(){
        println("I play for royal challengers banglore")
    }
}
fun main(args: Array<String>){
    val t1=MathTeacher(25,"Ashita")
    t1.teachMaths()
    println()
    val C1=Cricketer(20,"Ashita")
    C1.playCricket()
    var text="ashita"
    for(letter in text){
        println(letter)
    }
}