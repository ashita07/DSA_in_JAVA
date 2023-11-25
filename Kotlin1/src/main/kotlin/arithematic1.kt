import kotlin.math.*

fun main(){
 val myArray=arrayOf(3,4,6,7,9)
       val array2=arrayOf("hello","hey","namaste")
       println(array2[2])
//    val age=readLine()?.toInt()
//    if(age!=null)
//    {
//        if(age >= 18)
//        println("wtf")
//        else
//            println("doomed")
//        var a="245"
//        var b=a.reversed()
//        println(b)
//
//    var arr=arrayOf(2,5,67,5)
//    var arrLength=arr.size
//    println(arrLength)
//    var g =5.0
//    var h= g.pow(3.0)
//    var j=h.pow(2)
//    println("$h $j")
//    var arr2=arrayOf(4,66,45,77,2,44)
//    for(i in arr2)
//    {
//        println(i)
//    }
//    val abc =22.0
//    print(abc)
//    println()
    for(a in 'a' .. 'z')
    {
        print("$a ")
    }
    var list =listOf(1,2,3,5,6)
    //lists are immutable
    //but we can create a mutable list
    var a= mutableListOf<Int>()
    a.add(5)
    a.removeAt(0)
    println(a)
}