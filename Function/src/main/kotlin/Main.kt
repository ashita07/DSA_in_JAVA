fun main(args: Array<String>)
//you need to call the function from the main function to execute what's inside
{
    hell("ashita", 22)
    sayhello()
    sayhello()  //called function twice
    val hasInternetConnection = false
    if (hasInternetConnection) {
        getData("good")
    } else
        showMessage()

    val max = getMax(5, 9)
    println(max)


    val min = tocheckreturn(22, 66)
    println(min)
    var mam =last(23 ,43)
    println(mam)
}

fun sayhello() {
    println("Hello")

}


//functions can take input through parameters
fun hell(name: String, age: Int)//we need to explicitly say the datatype of parameters
{
    var number = 50
    println("hello $name and your age is $age")
}


fun getData(data: String) {
    println(data)
}

fun showMessage() {
    println("there is no internet connection")
}

//return a value in a function
fun getMax(a: Int, b: Int): Int {
    val max = if (a > b)
        a else b
    return max
}

//we can have two returns if they are branched
// they can never be called together
fun tocheckreturn(a: Int, b: Int): Int {
    if (a < b) return a else return b

}

//return without using return
//in a single statement
fun last (c :Int,d:Int) : Int = if (c>d) c else d
// fun last (c:int , d:int)
//{ return if(c>d) b else d}



