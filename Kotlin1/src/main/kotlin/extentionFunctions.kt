//fun main(){
//println("input a number")
//    var x=readLine()?.toInt()
//    if(x!=null)
//       if( x.extFun())
//           println("$x is prime")
//    else
//        print("$x is not prime")

//}
//
//fun Int.extFun():Boolean{
//for(i in 2 until this-1)
//{
//    if (this %i==0)
//        return false
//}
//    return true
//}
fun main(){
    var list= mutableListOf<Int?>()
    for(i in 0 ..6)
    {
        list.add(readLine()?.toInt())
    }
    println(  list.productList())
}

fun List<Int?>.productList():Int?{
var result=1
    for(value in this)
    {if(value!=null)
    {  result*=value  }
    }
    return result
}