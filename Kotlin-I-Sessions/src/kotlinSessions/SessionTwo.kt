package kotlinSessions

/**
 * The main method is the application entry point.
 *
 * @author pavl_g.
 */
fun main() {

    //--------------------------------Ranges------------------------------------

    // Ranges : define an interval with a lowest value and a highest value.
    // a range from 1 to 5
    val testRange = 1..5
    println("Test Ranges with default ranges (IntRanges)")
    println("Printing the range $testRange")
    // all non-fractional (integer) data types have their corresponding range types
    // Int has IntRange
    // Long has LongRange
    // Char has CharRange
    // the default usage is IntRange for small numbers
    // for example : doing a range from number (2147483647 + 20) to number (2147483647 + 25) which has 6 numbers in between
    val minNumber: Long = Int.MAX_VALUE.toLong() + 20
    val maxNumber: Long = Int.MAX_VALUE.toLong() + 25
    val testRange2: LongRange = minNumber..maxNumber
    // print our range as a string
    println("Test Ranges with longs")
    println("Printing the range $testRange2")
    // print our range as numbers, we will see this in more details later in this session
    for (number in testRange2) {
        println(number)
    }

    println("Test Ranges with characters")
    // test a character range
    val myAlphas: CharRange = 'A'..'Z'
    // print our capital alphas
    for (alpha in myAlphas) {
        print(alpha)
    }
    println()
    // test our small alphas
    val mySmallAlphas: CharRange = 'a'..'z'
    // print our small alphas
    for (alpha in mySmallAlphas) {
        print(alpha)
    }
    println()


    // ---------------Enrichment info--------------For later on-----------
    // other ways to control our ranges, we will discuss these in more details on future sessions
    println()
    // a foreach function :  Performs the given [action] on each element, each element is represented by it on its turn.
    // its equivalent to the regular for loops discussed in this session.
    myAlphas.forEach {
        print(it)
    }
    println()

    // Using the ranges property attributes
    // Ranges have some property attributes or variables that you can use to describe them or re-define or change them or even creating new ranges

    // 1) example prints those properties
    val myRangeTest: IntRange = 1..5
    println("Print the first number ${myRangeTest.first}")
    println("Print the last number ${myRangeTest.last}")
    println("Print the step between numbers ${myRangeTest.step}")

    // 2) example shows re-defining a range
    var myRedefineRange: IntRange = 0..0
    println("This would print nothing !")
    myRedefineRange.forEach {
        println(it)
    }
    // now the range is redefined from 0 to 10
    myRedefineRange = myRedefineRange.first..myRedefineRange.last + 10
    println("Test my redefined range : ")
    myRedefineRange.forEach {
        print(it)
    }
    println()

    // 3) using the ranges attributes to build new ranges (either step-ups or step-downs)
    var myLovelyRange: IntRange = 1..20
    myLovelyRange.forEach {
        println(it)
    }
    // re-evaluate our range
    myLovelyRange = myLovelyRange.first + 10..myLovelyRange.last + 20
    // now print our re-evaluated range
    println("Print the re-evaluated range !")
    myLovelyRange.forEach {
        println(it)
    }
    // a progression is a step down range
    val progression: IntProgression = (myLovelyRange.last downTo myLovelyRange.first)
    progression.forEach {
        println(it)
    }
    //-----------------------------------------------------------------------------------

    //-----------------------------------------------------------------------------------


    //---------------------------------Loops----------------------------------

    // a loop is a block which is designed to be of a repeated execution
    // instead of saying
    // var x: Int = 0
    // println(x + 1)
    // println(x + 1) .....
    // we would commonly say
    println("Test for loop")
    // this loop would repeat 3 times starting from number = 0,...number = n + 1.....number = n + 2 and so on till n = 2
    // within each turn of this loop, we would like to print the current number
    val range: IntRange = 0..2
    for (number in range step 1) {
        println(number)
    }

    // we can define the range directly without IntRange or LongRange or Doub


    // the same code can be written using a while loop with operand inequalities operations (>=, <=, ==, !=)
    println("Test equivalent while loop")
    // var i = 0 and i <= 2 is the same as ordering a looper in the range 0..2
    var i: Int = 0
    // means that we would execute code inside the while block as long as our i value is less than or equal to 2.
    // at the first turn i = 0; stills less than 2.
    // at the 2nd turn i = 1; stills less than 2.
    // at the 3rd turn i = 2; equals to 2.
    // at the 4th turn i = 3; not less than or equal to 2; then loop terminates without entering the while block {}.
    // so the output is 0, 1, 2
    while (i <= 2) {
        println(i++)
    }

    // do while loop is the same as while loop but the first condition is a mandatory condition .
    // (ie: it is executed only one time even if the condition is not true).
    println("Test do while loop")
    // testing a mandatory action with an impossible condition or a false condition.
    i = 0
    do {
        // the same as i = i + 1
        println(++i)
    } while (i > 2)


    // 6) Jump statements
    val myRange: IntRange = 1..5
    // break is used to stop the loop block from running
    for (number in myRange step 1) {
        println("Before break")
        if (number > 3) {
            println("Inside the condition !")
            // stops looping
            break
        }
        println("After break")
    }

    // continue is used to skip the lines after it and continue looping
    for (number in myRange step 1) {
        println("Before continue")
        if (number > 3) {
            println("Inside the condition !")
            // skips the lines after it and continue looping
            continue
        }
        println("After continue")
    }

    //-----------------------------------------------------------------------


    //--------------------------------- Exercises --------------------------------------------

    // The factorial function (symbol: !) refers to multiplying all whole numbers from our chosen number down to 1.
    // Rule = n! = n × (n−1) x (n-2) x (n-3) x .........
    // see more at : https://www.mathsisfun.com/numbers/factorial.html
    // request user input for a number value
    val number: String? = readLine()
    // check if the number is available
    if (number != null) {
        //convert the input to a number
        val input: Int = number.toInt()
        // create an interval for the factorial
        val range = 1..input
        // create a memory to hold the result
        var result: Int = 1
        // find the product of this range
        for (n in range) {
            result *= n
        }
        println(result)
    } else {
        println("Invalid Input !")
    }

    // equivalent code

    // !! is the 'not-null assertion operator'
    // it checks if the value is null, if so then it converts it to a non-null value or empty string "".
    // it asserts the value to be non-null.
    // and its equivalent to
    /*
     *
     *  var number: String? = readLine()
     *  if (number != null) {
     *     number = number
     *  } else {
     *     number = ""
     *  }
     *
     */
    val input: Int = readLine()!!.toInt()
    // create an interval for the factorial
    // create a memory to hold the result
    var result: Int = 1
    // find the product of this range
    for (n in 1..input) {
        result *= n
    }
    println(result)

    /*
    * Debugging exercise (DIY) :
    *
    * In the previous examples, try to input non-number values such as : your
    * name for example, observe and record your output and try to find a solution.
    *
    * Send the solution back to us !
    *
    */

    // multiplication table examples

    // In this example, we will guide you step-by-step to build a CLI program to print the
    // multiplication table of a given number.

    // 1) Request user input and convert it to an empty string "" if it was null (assertion).
    val userInput: String = readLine()!!
    // 2) Create a variable for the user input
    val multiplicativeNumber: Int
    // 3) try to convert user input to a number, if it was convertible then use the input
    // otherwise exit with a user message.
    try {
        // try to convert the user input to a number
        multiplicativeNumber = userInput.toInt()
        // the block would continue if the input is a number
        // 4) Now let's find our multiplication table for this input, a multiplication table is in range from 1 to 12
        println("The multiplication table of $multiplicativeNumber")
        // this loop would repeat 12 times starting from n = 1,...n = n + 1.....n = n + 2 and so on till n = 12
        // within each turn of this loop, we would like to print the corresponding product
        for (n in 1..12 step 1) {
            println("$multiplicativeNumber x $n = ${multiplicativeNumber * n}")
        }
    } catch (e: NumberFormatException) {
        // gets executed if the input is not a number
        println("Invalid Input !")
    }

}