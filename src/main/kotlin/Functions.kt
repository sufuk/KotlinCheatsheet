fun myFunction() {
    println("I just got executed!")
}
fun myFunction2(fname: String) {
    println(fname + " Doe")
}
fun myFunction3(fname: String, age: Int) {
    println(fname + " is " + age)
}
fun myFunction4(x: Int): Int {
    return (x + 5)
}
fun myFunction5(x: Int, y: Int) = x + y
fun functions(){

    myFunction()
    myFunction2("sufuk")
    myFunction3("sufuk", 22)
    var myvar =myFunction4( 22)
    println(myvar)
    println(myFunction5(2,3))

}