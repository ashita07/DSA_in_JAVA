fun main(args: Array<String>)
{//function overloading
val max=getmax(4,100,9)//automatically calls the second function
    println(max)
}

fun getmax (a:Int ,b:Int) = if(a>b)a else b
fun getmax (a:Double ,b:Double) = if(a>b)a else b
fun getmax (a:Int,b:Int , c:Int)  :Int{
    return if (a >= b && a >= c)
        a
    else if (b >= c && b >= a)
        b
    else
        c
}