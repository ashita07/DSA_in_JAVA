import java.util.*

fun main(args: Array<String>)
{
    val call=InitFunction("ashita",20)
}
class InitFunction(val name:String,var age: Int)
{
    val firstName:String = name.uppercase(Locale.getDefault())
    var age1:Int = age

    init{
        println("First name = $firstName")
        println("Age = $age1")
    }
}