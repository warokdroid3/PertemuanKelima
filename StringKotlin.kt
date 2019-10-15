package com.erikriosetiawan

fun main() {

    /**
     * String equality
     */
    var str1 = "Hello, World!"
    var str2 = "Hello," + " World!"
    println(str1 == str2)

    str1 = """
        |Hello, World!
    """.trimMargin()

    str2 = """
        #Hello, World!
    """.trimMargin("#")

    val str3 = str1

    println(str1 == str2)
    println(str1 === str2)
    println(str1 === str3)

    /**
     * String literals
     */
    // Escaped string
    val s = "Hello, World!\n"

    // Raw string
    val text = """
        |Tell me and I forget.
        |Teach me and I remember.
        |Involve me and I learn.
        |(Benjamin Franklin)
    """.trimMargin()

    /**
     * Elements of String
     */

    val str = "Hello, World!"
    println(str[1])

    for (c in str) {
        println(c)
    }

    /**
     * String Templates
     */
    val i = 10
    val n = "i = $i"

    val o = "abc"
    val str4 = "$o length is ${o.length}"

    val str5 = "\$foo"

    val price = """
        ${'$'}9.99
    """
}
