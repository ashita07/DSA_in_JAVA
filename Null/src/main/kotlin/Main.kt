fun main(args: Array<String>) {
//null pointer exception
var text : String? =null
  text ="sahi hai"
 var text2= text?: "This Variable is null"
   println("$text2")

    //in the longer way this can be done as well

    var text3 = text?:"This is a null variable"
     println(text3)
    /*var text3 =""
    if (text !=null)
    {
       text3 =text

    }else
        text3="This Variable is null"
    println(text3)*/

}