package kotlinSessions

/**
 * The main method is the entry point for any application in almost all
 * programming languages including kotlin, write all your executable code here.
 * NB : Comments represent non-compilable and non-executable code.
 *
 * @author pavl_g.
 */
fun main() {

    //------------------------------ Introduction to applications and kotlin --------------------------
    // Refer to our manual for intro.
    //-------------------------------------------------------------------------------------------------


    //---------------------------------------Basic Syntax---------------------------------------------
    // Refer to our manual for basic syntax.
    // https://kotlinlang.org/docs/basic-syntax.html
    //-------------------------------------------------------------------------------------------------


    // printing things onto your screen -- output message to the console
    println("Welcome to our lovely course !")


    //---------------------------------------Basic Types---------------------------------------------

    // var is a changeable data (variable data)
    // val is an unchangeable data (constant data)

    // an integer is either a +ve or -ve non-fractional 32-bit number
    val positiveInt: Int = 23222222
    val integerSize: Int = Int.SIZE_BITS
    val integerMax: Int = Int.MAX_VALUE
    println(positiveInt)
    println(integerSize)
    println(integerMax)

    // a long is either a +ve or -ve non-fractional 64-bit number
    val positiveLong: Long = 23222222L
    val longSize = Long.SIZE_BITS
    val longMaxValue: Long = Long.MAX_VALUE
    println(positiveLong)
    println(longSize)
    println(longMaxValue)

    // a float is either a +ve or -ve real number of 32-bit storage, it ends with F or f
    val positiveFloat: Float = 2.23F

    // a Double is either a +ve or -ve real number of 64-bit storage
    val positiveDouble: Double = 2.2314141241241421414

    // unsigned integers are neither +ve nor -ve numbers 
    // common examples are age, device vendors, phone numbers, serial numbers, music duration and battery percentage
    var unsignedInt: UInt = 20u
    unsignedInt += 2u
    println(unsignedInt)

    // boolean values are either true or false
    var myBoolean: Boolean = true
    // print before flipping
    println("Boolean test : $myBoolean")
    // to flip a boolean use the inverse or inverter operator
    myBoolean = !myBoolean
    // print after flipping
    println("Boolean test : $myBoolean")

    // if we want to represent a letter from alphabet, we use Chars
    var letter: Char = 'A'
    letter = 'a'
    println("My Letter is a changing value : $letter")

    // using a value not a variable
    val letter2: Char = 'D'
    println("My Letter is a constant value : $letter2")

    //-----------------------------------------------------------------------------------------------


    //----------------------------------------Comments in kotlin---------------------------------------------

    // Comments represent non-compilable and non-executable code
    //single line comment
    /**
     * Documentation comment
     */

    /*
     * Multiline comment
     * Yes, as you can see, this is not compiled by the kotlin compiler
     */

    //-------------------------------------------------------------------------------------------------------


    //---------------------------------------Casting between data types---------------------------------------------

    // casting is converting from a data type to another data type
    // converting boolean to a string
    var condition4: Boolean = true
    val convert4: String = condition4.toString()
    //converting from string to boolean
    condition4 = convert4.toBoolean()
    // converting an Int to a String
    val myNumber: Int = 2
    val convertMyNumber: String = myNumber.toString()

    //--------------------------------------------------------------------------------------------------------------


    //---------------------------------------Exercise---------------------------------------------

    // 1) creating your ID data

    // your name is a constant data and its a String or some characters from alphabets
    val myName: String = "Mohammed"
    // your age is changing and unsigned number
    var myAge: UInt = 21u
    // your work is a constant data
    // defining the type of data as String is optional here
    val work: String = "Engineer"
    // your religion is a constant
    val religion: String = "Muslim"
    // your ID number is a constant value
    // defining the type of data is a must here or else append L at the end of a big number
    val idNumber: Long = 22341512312343
    // now print your own ID
    println("----------------------------")
    println("| Name : $myName |")
    println("| Age : ${myAge} |")
    println("| Work : $work |")
    println("| Religion : $religion |")
    println("| ID Number : $idNumber |")
    println("----------------------------")

    // 2) print your ID after 2 years

    println("----------------------------")
    println("| Name : $myName |")
    println("| Age : ${myAge + 2u} |")
    println("| Work : $work |")
    println("| Religion : $religion |")
    println("| ID Number : $idNumber |")
    println("----------------------------")

    //-----------------------------------------------------------------------------------------------------


    //--------------------------------------- Basic Operations ---------------------------------------------

    // 1) a calculator example
    val x: Int = 2
    val y: Int = 3

    val addition: Int = x + y
    println("Sum = $addition")

    val subtraction: Int = y - x
    println("Difference = $subtraction")

    val product: Int = x * y
    println("Product = $product")

    // multiplication will be done before addition
    val multiplicativeProperty: Int = (x * y) + 1
    println("Result = $multiplicativeProperty")

    val division: Int = 4 / 2
    println("Division = $division")

    // equivalent operations
    // 'x += 10' is the same as 'x = x + 10'
    // '++x' is called a prefix increment the same as 'x += 1' and 'x = x + 1'
    // 'x++' is called a postfix increment, its same as :
    // 'x = x' at this line
    // 'x = x + 1' at the next line

    //-----------------------------------------------------------------------------------------------------


    //--------------------------------------- Boolean Algebra ---------------------------------------------

    // boolean is either true or false
    // think of logic gates when it comes to booleans or the probability of certainty/truth and impossibility/lie (0 or 1)
    // true means 1 means (certain)
    // false means 0 means (impossible) OR (uncertain)
    var probability1: Boolean = true
    var probability0: Boolean = false
    // when 1 (true) and 0 (false) are combined in a logic gate AND the result would be 0 (false)
    // the AND gate is designated by && symbol for logical AND
    println("Test booleans AND : ${probability0 && probability1}")
    // when 1 and 0 are combine in a logic gate OR the result would be 1
    // the OR gate is designated by || symbol for logical OR
    println("Test booleans OR : ${probability0 || probability1}")
    // when 1 (true) is inverted, the result is zero (false)
    // ! is called the inverter gate or the logical inverse
    println(!probability1)
    // when 0 (false) is inverted, the result is one (true)
    // ! is called the inverter gate or the logical inverse
    println(!probability0)

    //---------------------------------------------------------------------------------------------


    //--------------------------------------- Operand Operations ---------------------------------------------

    // Operand Operations are operations that involve using '==' for operand equal, '!=' for operand not equal
    // '>=' for bigger than or equal and '<=' for less than or equal
    // to compare between numbers, the result is a boolean expression
    val condition: Boolean = 1 >= 2
    println("Test operand bigger than or equal : $condition")

    // the not equal operand
    val condition2: Boolean = 1 != 2
    println("Is 1 not equal to 2 ? $condition2")

    // the result is false, because simply the two numbers are equal
    val condition3: Boolean = 10 != 10
    println("Is 10 not equal to 10 ? $condition3")

    // the equal operand
    val conditionB: Boolean = 1 == 1
    println("Is 1 equal to 1 ? $conditionB")

    var age: UInt = 20u
    // checks whether this age is a university student age
    val isStudent: Boolean = age >= 20u
    println("Check my age : $isStudent")

    //---------------------------------------------------------------------------------------------------------


    //--------------------------------------- Control flow statements ---------------------------------------------

    // Control flow statements (if{}else{}, when{}, for{}, while{}, do{} while{} loops)
    // 1) Conditional if else accepts a condition and if its true the if block would be executed otherwise the else would be used and
    // the if block would be skipped.
    if (probability0 == true) {
        println("The condition is true")
    } else {
        println("The condition is false")
    }

    // nested if..else, to check multiple conditions
    if (age > 0u && age <= 5u) {
        println("Kindergarten -- KG")
    } else if (age > 5u && age <= 10u) {
        println("Primary School")
    } else if (age > 10u && age <= 14u) {
        println("Preparatory School")
    } else if (age > 14u && age <= 17u) {
        println("Secondary School")
    } else if (age > 17u && age <= 24u) {
        println("University Student")
    } else {
        println("Worker")
    }

    // 2) when is to check for a specific case, if this case is equal to the input
    // then execution of that block would take place
    // Syntax
    val input: Int = 200
    when (input) {
        // if input equals to 3 then execute this block
        (3) -> {
            println("Input was 3")
        }
        (4) -> {
            println("Input was 4")
        }
        (200) -> {
            println("Input was 200")
        }
    }

    // 3) another use case
    // increment the age
    age = age + 10u
    when (age > 20u && age >= 18u) {
        (true) -> {
            println("Worker")
        }
        (false) -> {
            println("University Student")
        }
    }

    //---------------------------------------------------------------------------------------------------------


    //---------------------------------------- An introduction to Exception Handling -------------------------------------------------
    // Exception handling is used to control the flow of your program if an un-accepted action takes place
    // for example : dividing a number by zero would result in a ArithmeticException which is the same
    // as the math error message you see in your calculator
    val number1: Int = 1
    val number0: Int = 0
    var result: Int
    try {
        // when we divide a number by zero, the program skips the lines after this operation and enters the catch() block
        // a throws a math error message
        result = number1 / number0
    } catch (e: ArithmeticException) {
        println("Math Error")
    }
    //-----------------------------------------------------------------------------------------

    //--------------------------------------- Null values---------------------------------------------

    // null : means nothing and when a variable is null, it doesn't have a registered memory
    // imagine you have a bowl (memory) and that bowl is empty (null memory), its not logical to try to use what's inside the bowl
    // the same thing goes with any variable, if the variable is null, you cannot use it
    // a variable must hold a valid value, so you can use it

    // an example of an invalid variable
    // '?' is the Elvis operator, used to register a variable as a nullable variable
    var variable: Int? = null
    // if you try to use this variable as a number, the program will not start and will give out an error
    // println(variable * 2)
    // Kotlin: Operator call corresponds to a dot-qualified call 'variable.times(2)' which is not allowed on a nullable receiver 'variable'.
    // that means that you cannot use (*) the times operator on an invalid target !
    // if we re-evaluate our variable by a number that will enable us to use the (*) times operator
    variable = 2
    println(variable * 2)
    // On some occasions, we want to be safe from errors resulting from using an invalid variable to do some operations
    // in this case we can check if the variable isn't invalid
    // using an `if` block and a `!=` (not equal operand operator); the result would be either true if the variable is valid or false otherwise
    // if the condition of `if statement` is true then the `if block` is executed, otherwise if the condition is false then the `else block` would run
    // in that case we would never get an error from using a nullable variable (invalidated variable).
    if (variable != null) {
        println(variable * 5)
    } else {
        println("The varibale is invalid !")
    }
    // the usage of this would become more obvious when we have a user input and we want to ensure the user input is a valid input
    // the last example on this sessions explains this !

    //--------------------------------------------------------------------------------------------------------------------


    //-----------------------------------------Dealing with console----------------------------------------------

    // Dealing with console : means accepting user input from the console and sending output messages back to the
    // console

    // to send a message to the console use as we have described before
    println("A message to the console")

    // to receive user input from the console -- use readLine()
    // String? -> is the 'nullable' sign -> means that the input may be unavailable or blank
    val uInput: String? = readLine()
    println("My message was $uInput")

    //-------------------------------------------------------------------------------------------------------------


    //---------------------------------------Operations and console io---------------------------------------------
    println()
    print("Enter first number : ")
    val firstNumber: String? = readLine()

    println()
    print("Enter second number : ")
    val secondNumber: String? = readLine()

    println()

    //-----Processing the input-----
    // as we have discussed before, the try catch is used to try some tasks and catch an unaccepted actions
    // in this case : the un-accepted action would be if the user has inputted nothing or letters or any non number formats
    // the exception type which is thrown here is the NumberFormatException
    try {
        // null-checking : if a value is null then it represents nothing, so we cannot convert a 'nothing' to an integer, so we
        // have to check for nullity before using the input
        // null means nothing and '!=' checks if 2 values are not equal, if the condition is met then the statement is true.
        if (firstNumber != null && secondNumber != null) {
            println("The sum = ${firstNumber.toInt() + secondNumber.toInt()}")
        }
    } catch (e: NumberFormatException) {
        println("Please make sure to enter a valid number !")
    }
    //---------------------------------------------------------------------------------------------------------------


}
