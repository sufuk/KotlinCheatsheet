fun nullability() {

    val favoriteActor_1 = null
    println(favoriteActor_1)

    var favoriteActor_2: String = "Sandra Oh"
    favoriteActor_2 = "Meryl Streep"
    println(favoriteActor_2)

    // Null can not be a value of non-null type string Compile Error
    //favoriteActor_2 = null

    // ? used for nullable type
    var favoriteActor_3: String? = "Sandra Oh"
    println(favoriteActor_3)
    favoriteActor_3 = null
    println(favoriteActor_3)

    var favoriteActor_4: String = "Sandra Oh"
    println(favoriteActor_4.length)

    var favoriteActor_5: String? = "Sandra Oh"

    // Compile Error Only safe (?.) or non-null asserted (!!.)
    // calls are allowed on a nullable receiver of type String?
    //println(favoriteActor_5.length)

    // Use the ?. safe-call operator
    println(favoriteActor_5?.length)

    var favoriteActor_6: String? = null

    // Use the ?. safe-call operator
    println(favoriteActor_6?.length)


    //As the name suggests, if you use the !! not-null assertion,
    // it means that you assert that the value of the variable isn't null,
    // regardless of whether it is or isn't.
    var favoriteActor_7: String? = "Sandra Oh"
    println(favoriteActor_7!!.length)

    var favoriteActor_8: String? = null
    // Compile Error
    // println(favoriteActor_8!!.length)

    var favoriteActor_9: String? = "Sandra Oh"

    if (favoriteActor_9 != null) {
        println("The number of characters in your favorite actor's name is ${favoriteActor_9.length}.")
    }

    var favoriteActor_10: String? = "Cigdem"

    if (favoriteActor_10 != null){
        // You can acsess directly without ?. or !!. in null check ifs
        println(favoriteActor_10.length)
    }

    var favoriteActor_11: String? = "Sandra Oh"

    // ?: Elvis operator is used
    var lengthOfName = favoriteActor_11?.length ?: 0

    println("The number of characters in your favorite actor's name is $lengthOfName.")

    favoriteActor_11 = null

    lengthOfName = favoriteActor_11?.length ?: 0

    println("The number of characters in your favorite actor's name is $lengthOfName.")

}