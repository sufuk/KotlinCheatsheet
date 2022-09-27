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
}