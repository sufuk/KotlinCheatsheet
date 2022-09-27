fun main(args: Array<String>) {


    println("Hello World!") // Used for printing a line

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    print("these all be ")
    print("in the same ")
    print("line")

    var name = "John"
    val birthyear = 1975

    println(name)          // Print the value of name
    println(birthyear)     // Print the value of birthyear
    name = "Sufuk"
    println(name)
    /*The difference between var and
    val is that variables declared with
    the var keyword can be changed/modified,
    while val variables cannot.
    */

    // Declaring a variable without assigning
    var name_2: String
    name_2 = "John"
    println(name_2)

    val myNum_1: Int = 5                // Int
    val myDoubleNum: Double = 5.99    // Double
    val myLetter: Char = 'D'          // Char
    val myBoolean: Boolean = true     // Boolean
    val myText: String = "Hello"      // String

    val myNum_2: Byte = 100
    println(myNum_2)

    val myNum_3: Short = 5000
    println(myNum_3)

    //The Int data type can store whole numbers from -2147483648 to 2147483647:
    val myNum_4: Int = 100000
    println(myNum_4)

    //The Long data type can store whole numbers from -9223372036854775807 to 9223372036854775807
    val myNum_5: Long = 15000000000L
    println(myNum_5)

    //Float is only six or seven decimal digits, while Double variables have a precision of about 15 digits.
    val myNum_6: Float = 5.75F
    println(myNum_6)

    val myNum_7: Double = 19.99
    println(myNum_7)

    val myNum1: Float = 35E3F
    val myNum2: Double = 12E4
    println(myNum1)
    println(myNum2)

    val isKotlinFun: Boolean = true
    val isFishTasty: Boolean = false
    println(isKotlinFun)   // Outputs true
    println(isFishTasty)   // Outputs false

    val myGrade: Char = 'B'
    println(myGrade)

    val myText2: String = "Hello World"
    println(myText2)
}