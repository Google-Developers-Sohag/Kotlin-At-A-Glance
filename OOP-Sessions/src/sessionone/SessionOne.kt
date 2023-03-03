package sessionone
/**
 *  why OOP??
 * --Simplicity: Program objects model the real world,
 * thus reducing complexity and
 * streamlining the program structure
 * --Modularity: Each object's internal workings are decoupled from other parts of
 * the system
 * --Modifiability: Changes inside an object do not affect any other part of a program
 * if you have done your design right
 * --Extensibility: An object's requirements change quite often, and you can quickly
 * respond to them by adding new objects or modifying existing ones
 * --Reusability: The objects can be used in other programs
 */

/**
 *  What is Classes?
 *  Classes are the main building blocks of any object-oriented programming language.
 */

// Syntax of class note that: Class name starts with Capital letter
class ClassName {}

/**
 * This is an example of classes define characteristics of a person
 */
class Person {
    var name = "Person name"
    var age = 20
    var college = "Faculty of Engineering"
}

/**
 * Objects...
 * Imagine that you are a chef, and you want to make a cake,
 * making cake requires a template that shapes the cake e.g. a heart shape
 * or whatever shape you want this template in programming is the class
 * and the cake itself which has the shape of the template is the object.
 */


/**
 * Constructors
 * The class construct supports the first characteristic of an OOP language: encapsulation. The
 * idea behind it is that you want to keep each class discreet and self-contained. This allows
 * you to change its implementation without affecting any part of the code that uses it, as long
 * as it continues to meet the terms of its contract.
 */

class Car constructor(val name: String, val model: String) {

    // your print function to print name and model of the car
    fun printNameAndModel() {
        println("Car Name: $name\nCar model: $model")

    }
}

// there are multiple ways of writing constructors
// class without constructor keyword
class Voyage(val from: String, val to: String) {
    // init keyword tells the compiler what to do while initializing the constructor
    init {
        if (from.isEmpty()) println("City From is empty")
        if (to.isEmpty()) println("City to is empty")
    }
}

// class with secondary constructor
class Cinema(val movieName: String, val price: Int?) {
    constructor(price: Int?) : this("", null)

}


/**
 *
 * Access levels:-
 * "private": means that the member is visible inside this class only (including all its members).
 * protected & internal will be explained after inheritance
 */
class ClassWithPrivateVal {
    private val x = 10
    fun printX() {
        println("you can print value of x = $x with a fun\nbut you can't access it with dot operator")
    }
}

/**
 * Nested class
 */
class OuterClass {
    fun funInOuterClass() {
        println("Welcome form Outer Class")
    }

    class InnerClass {
        fun funInInnerClass() {
            println("Welcome from inner class")
        }
    }
}

/**
 * Data Classes
 * they're classes don't have a body
 * generally used to create custom data types to store related set of data
 */

data class Book(val title: String, val author: String, val pages: Int)

fun main() {
    // start of first concept classes && objects
    // make object from Person class "Never forget () " ^_^
    val objectFromPersonClass = Person()
    // let's define another object with real person data
    val khaled = Person()
    // to access variables of function inside a class use dot operator
    khaled.name = "Khaled"
    khaled.age = 25
    khaled.college = "Faculty of Arts"
    println(
        "Person name:${khaled.name}\n" + "Person age:${khaled.age}\n" + "Person college:${khaled.college}"
    )
    // end of first concept classes && objects
    println("**************************************")


    // start of second concept constructors

    // create an instance of Car Class
    val BMW = Car("BMW", "2022")
    // accessing functions as same as variables with dot operator
    BMW.printNameAndModel()

    // Class without constructor keyword
    val france = Voyage("France", "")
    println(france.from)

    // class with secondary constructor
    // make instance with secondary constructor
    val cinema = Cinema(null)
    println(cinema.price)
    // end of second concept constructors
    println("**********************************")

    // start of third concept access levels
    val privateVal = ClassWithPrivateVal()
    // privateVal.x -> error
    privateVal.printX()
    // end of third concept access levels
    println("**********************************")

    // start of fourth concept Nested classes
    val outerClass = OuterClass()
    outerClass.funInOuterClass()
    // making an instance of inner class
    val innerClass = OuterClass.InnerClass()
    innerClass.funInInnerClass()
    // end of fourth concept Nested classes
    println("**********************************")

    // start of fifth concept Data Classes
    val book = Book("Romeo and Juliet", "Shakespeare", 500)
    val libraryList = ArrayList<Book>()
    libraryList.add(book)
    libraryList.add(book)
    libraryList.add(book)
    libraryList.forEach {
        println("book title: ${it.title}\n" + "book Author: ${it.author}\n" + "book Pages: ${it.pages}")
    }
    // end of fifth concept Data classes
    println("**********************************")

    // ~~~~~~end of session #1~~~~~~~~~~

}
