package sessiontwo.task.solution
/**
 * Quick Revision for last session
 */

// inheritance

// super class
open class Animal {

    fun numberOfLegs() {

    }

    fun gender() {

    }

}

// subclass
class Cat : Animal() {
    fun meow() {
        // call functions from super class
        numberOfLegs()
        gender()
    }

    // remember I can't call superclass functions' from outside function block
    // numberOfLegs() error


}

// companion objects

class Companion {


    // companion object enables us to access a function or a variable without making an object from the class
    companion object {
        fun canAccess() {

        }
    }


}


fun main() {
    // we can access our function from companion object without making an object like Companion().
    Companion.canAccess()


}

// polymorphism (overloading)
// this concept enables us to give many functions the same name but under some conditions
// 1- have the same count of parameters but with different data types
// 2- have different count of parameters
fun area(l: Int) {}
fun area(l: Double) {}
fun area(l: Int, m: Int) {}

/**
 * New
 *
 */

// overriding

//Overriding is an object-oriented programming feature that
// enables a child class to provide different implementation for a method that
// is already defined and/or implemented in its parent class or one of its parent classes
open class Shape {
    open fun rectangle() {

    }

    open fun triangle() {}
}

class Area : Shape() {
    // this code  provides different implementation for rectangle fun
    override fun rectangle() {
        println("Length * Width")
    }

}

/// abstract classes && interfaces


// we can't make a direct object from abstract class we should inherit it from another class at first then use the inherited class
abstract class BaseView {
    abstract fun textView()
    fun button() {}
}

class Image : BaseView() {
    override fun textView() {
        TODO("Not yet implemented")

    }

    fun hi() {
        button()
    }

}


// interface
// the same as abstract class but there are main differences
/**
 * In one class we can't inherit more than one abstract class, but we can inherit any number of interfaces
 * all functions or variables in interfaces are abstract, but in abstract classes we can make some abstract and other not
 */

interface IBaseView {
    fun textView()
    fun button()

}

class ImageFromIBase : IBaseView {
    override fun textView() {
        TODO("Not yet implemented")
    }

    override fun button() {
        TODO("Not yet implemented")
    }
}



