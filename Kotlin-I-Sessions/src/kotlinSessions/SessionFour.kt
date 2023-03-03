package kotlinSessions

//-------------------------------------Functions----------------------------------------------
// A function : represents a task block inside any software application.
// the fun main() represents the main thread process and we usually call it the main method.
// A thread : is a collection of program tasks (user-code) that run serially line by line.
// A function is a descriptive block for a task to be ran on a thread.
// main() : defines the main thread which is the main channel to run our tasks.
// A task : is the user code, examples : adding 2 numbers, collecting names and data, sending a message,...etc.
// There a 2 types of functions :
// Functions that don't return any value and they are usually called Unit Functions or Methods.
// Functions that have a return value, you can declare a return type using the colon ': Type' after the function names.

/**
 * A Unit function used for making pizzas, packaging and delivering them.
 * @return returns nothing.
 */
fun makePizza(): Unit{
    // a unit function is a process function that doesn't have a return value
    println("---------------------------My Pizza Task-----------------------------")
    println("Bake Pizza")
    println("Disperse Ingredients")
    println("Package Pizza")
    println("Deliver Pizza")
    println("---------------------------My Pizza Task-----------------------------")
}

/**
 * A function used for adding two numbers and returning the result.
 * @return returns out a sum of two numbers.
 */
fun add(): Int {
    // a function that adds 2 numbers and output the result
    return 2 + 3
}

/**
 * A function used for printing out an id using [String]s.
 * @return the id in a String format.
 */
fun myID(): String {
    return "Amer\n" +
            "29 yrs old \n" +
            "Engineer \n" +
            "ID : 2982319842093091 \n"
}
// 4) a return function can return any type, even arrays and ranges :
/**
 * A function used for returning an absolute [IntRange].
 * @return a range with upper limit and lower limit.
 */
fun absoluteRange(): IntRange {
    return 2..20
}

/**
 * A function used for returning an absolute [IntProgression].
 * @return a progression with an upper and a lower limit.
 */
fun absoluteProgression(): IntProgression {
    return 20 downTo 10
}

/**
 * A function used for returning an [ArrayList] of names.
 * @return a list of student names.
 */
fun studentNames(): ArrayList<String> {
    val names: ArrayList<String> = ArrayList()
    names.add("Micheal")
    names.add("Derek")
    names.add("John")
    return names
}
// you have noticed using this syntax 'fun name()' to define a function, but what's ()
// '()' are double parenthesis for passing parameters or variables locally to the function
// so if we want to add x and y and return the sum then x and y can be function's parameter variables.
// example

/**
 * Adds two numbers and returns the result.
 * @param x first number.
 * @param y second number.
 * @return the result of the summation of x and y.
 */
fun getSum(x: Int, y:Int): Int {
    return x + y
}
// We can modify the previous examples to use a parameterized functions.
// modify the studentNames function to accept a list parameter and wrap it inside a dynamic array, an ArrayList

/**
 * Wraps a [List] of defaults into an [ArrayList] and returns a new [ArrayList].
 * @param defaults a default list to add to our new [ArrayList].
 * @return an [ArrayList] that wraps a list of strings.
 */
fun studentNames(defaults: List<String>): ArrayList<String> {
    return ArrayList(defaults)
}

/**
 * The main function is the entry point for any kotlin application.
 * @return nothing.
 *
 * @author pavl_g.
 */
fun main(): Unit {
    // call the pizza task
    makePizza()
    println(add())
    println(myID())
    // print the range values
    val absoluteRange: IntRange = absoluteRange()
    absoluteRange.forEach {
        println(it)
    }
    absoluteProgression().forEach {
        println(it)
    }
    val studentNames: ArrayList<String> = studentNames()
    studentNames.forEach {
        println(it)
    }
    println("Get the sum of 2 numbers : ${getSum(100, 101)}")
    // adding the default names
    val myList: ArrayList<String> = studentNames(listOf("Amer", "Ahmed", "Gamal"))
    // printing the defaults
    myList.forEach {
        println(it)
    }
    // adding extra names
    myList.add("New Name 1")
    myList.add("New Name 2")
    myList.forEach {
        println(it)
    }
}
