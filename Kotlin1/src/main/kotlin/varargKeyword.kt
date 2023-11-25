
fun main()
{ var arr=intArrayOf(12,412,22)
    println(getMax2(22,54,26,*arr,77,242,7,43))
  //  println(getMax(listOf(2,5,6,7,12,17,19)))

    val result = getAverage(listOf(2,5,7,8,4))
    println(result)
}
//fun getMax(list2:List<Int>):Int
//{ var max=list2[0]
//    for(i in 0..list2.size-1)
//    if(max<list2[i])
//    {
//        max=list2[i]
//    }
//    return max
//}
fun getMax2(vararg nums:Int):Int{
    var max=nums[0]
    for(a in nums )
    {
        if(max < a)
        {max=a}
    }
return max
}fun getAverage(numbersList: List<Int>): Float {

    var sum = 0.0f
    for (item in numbersList) {
        sum += item
    }
    return (sum / numbersList.size)
}