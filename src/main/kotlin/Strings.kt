fun strings(){
    val txt = "Hello World"
    println(txt[0]) // first element (H)
    println(txt[2]) // third element (l)

    println("The length of the txt string is: " + txt.length)

    println(txt.uppercase())   // Outputs "HELLO WORLD"
    println(txt.lowercase())   // Outputs "hello world"

    val txt1 = "Hello World"
    val txt2 = "Hello World"
    println(txt1.compareTo(txt2))  // Outputs 0 (they are equal)

    val txt3 = "Please locate where 'locate' occurs!"
    println(txt3.indexOf("locate"))  // Outputs 7

    // using quotes in strings
    var txt4 = "It's alright"
    var txt5 = "That's great"

    //string contantation
    var firstName = "John"
    var lastName = "Doe"
    println(firstName + " " + lastName)
    println(firstName.plus(lastName))

    //another way to access strings
    println("My name is $firstName $lastName")
}