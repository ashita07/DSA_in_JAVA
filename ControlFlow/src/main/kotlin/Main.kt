fun main(args: Array<String>) {
    val alarm = 9

    val x = when (alarm) {
        //-> is used inside a when statement to point to the print statemnent

        12 -> 12
        7 -> println("The Time is $alarm")
        14 -> println("The Time is $alarm")
        11, 41, 2 -> println("The Time is $alarm")

        //multiple values can be put seperated by commas

        in 1..10 -> println("the number is  in the range 1 to 10")
        in 20..24 -> println("the number is between 20 to 24")

        //in is the keyword to check for range write in 1..12

        else -> println("The alarm is $alarm")

    }
    println("$x")
     val y= when {
        alarm<=7 -> "theek"
         else
           ->"thanks"

    }
println(y)

}