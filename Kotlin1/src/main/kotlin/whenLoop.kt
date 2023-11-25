fun main()
{
//    val age =readLine()?.toInt()
//    when(age)
//    {
//        in 0..5-> println("you are a young kid")
//        in 6..17->println("You are a teenager")
//        18->println("Finally you are 18")
//        19,20-> println("your a young adult")
//        in 21..65->println("Your an Adult now")
//        else->println("your old")}
     newFunc(5,3)
    aList(listOf(2,5,6,8,9,10))
}
fun newFunc(base:Int,exponent:Int)
{ var result=1
    for(i in 1..exponent)
    {
        result*=base
    }
    print(result)
}
fun aList(list:List<Int>)
{
    print(list[0])
}