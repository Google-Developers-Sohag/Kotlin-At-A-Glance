package kotlinSessions

/**
 * The main class is the entry point of your application.
 *
 * @author pavl_g.
 */
fun main() {
    //---------------------------------------Arrays----------------------------------------------
    // An Array : is a list of some items, the items can be of Any type.
    // the items have an order starting from (0) to (size - 1) and we usually call it an index.
    // to get a particular item from an array, we append the subscript notation '[]' to our variable name and write our corresponding index inside
    // asserting that its within the array range (0, size - 1).
    // to define an Array use the type Array<Type> which will define an array of a specific type
    val studentNames: Array<String> = arrayOf("Maged", "Abdo")
    studentNames.forEach {
        println(it)
    }
    // another way to define arrays of fixed size.
    // the block {} is called an initialize phase for the constructor, it creates default values for our array while initializing it using the indices
    val students: Array<String> = Array(3) {
        index: Int -> "Name"
    }
    students.forEach {
        println(it)
    }
    // modifying our array
    students[0] = "Maged"
    students[1] = "Mena"
    students[2] = "Morad"
    students.forEach {
        println(it)
    }
    // print our size
    println("Array Size = ${students.size}")

    //printing our items using ranges
    for (index in students.indices step 1) {
        println(students[index])
    }
    // print the array items in a reverse order
    // define an IntProgression using the first and the last index of our array
    val progression: IntProgression = (students.size - 1) downTo 0
    // now print them out
    for (index in progression step 1) {
        println(students[index])
    }
    // an equivalent code
    val reversedArray: Array<String> = students.reversedArray()
    reversedArray.forEach {
        println(it)
    }

    //----------------------------------------------------------------------------------------------

    //--------------------------------------Lists--------------------------------------
    // You can make a list from any data type described, for example :
    // lists are very similar to arrays.
    // list of students class names. --- as an example for a list of Strings.
    // list of students degrees. --- as an example for a list of unsigned floats.
    // list of shopping items. --- as an example for a list of Strings.
    // list of daily tasks. --- as an example for a list of Strings.
    // when defining a list, you will define a new data type which is a list of a particular primitive type
    // to select the primitive type for your list, declare the data type inside the angular brackets <> also
    // known as a generic type brackets.
    val listOfNames: List<String> = listOf("Amer", "Asmaa", "Andrew", "Akram")
    // now to print them, either use a regular for loop or a foreach or even a while/do..while loops can do this
    // using foreach to apply operations on each item individually
    listOfNames.forEach {
        println(it)
    }
    // further discussion on arrays -- please pay attention this is the sweet part !
    // when describing any list in our real life, we usually pay attention to the list order
    // for example : ("Amer", "Asmaa", "Andrew", "Akram") is an ordinal list (each item has its own order).
    // in kotlin this order is called the 'item index' or simply 'index'
    // most usually the arrays' indexes are natural number starts from 0 and ends with the (array.length - 1)
    // so, applying the concept back on our example yields the following :
    // "Amer" has an index of 0
    println("Printing our indices : ")
    println("Print Amer ${listOfNames[0]}")
    println("Print Asmaa ${listOfNames[1]}")
    println("Print Andrew ${listOfNames[2]}")
    println("Print Akram ${listOfNames[3]}")

    println("Print the list size : ")
    println("Size = ${listOfNames.size}")


    println("------------------------------------------------------------------------")

    println("Printing our indices, using the size as a parameter : ")
    val lastItemIndex: Int = listOfNames.size - 1
    println("Print Amer ${listOfNames[lastItemIndex - lastItemIndex]}")
    println("Print Asmaa ${listOfNames[lastItemIndex - 2]}")
    println("Print Andrew ${listOfNames[lastItemIndex - 1]}")
    println("Print Akram ${listOfNames[lastItemIndex]}")

    println("------------------------------------------------------------------------")

    println("------------------------------------------------------------------------")

    println("Getting the indexes of our items : ")
    println("Get Amer index (order) = ${listOfNames.indexOf("Amer")}")
    println("Get Akram index (order) = ${listOfNames.indexOf("Akram")}")
    println("------------------------------------------------------------------------")

    println("Test printing the items by a variety of loop formats : ")
    // using a regular for loop
    for (index in 0..(listOfNames.size-1)) {
        val item: String = listOfNames[index]
        println(item)
    }
    // using a regular for loop
    for (index in 0 until listOfNames.size) {
        val item: String = listOfNames[index]
        println(item)
    }
    // using a regular for loop
    for (element in listOfNames) {
        val item: String = element
        println(item)
    }
    // using a while loop or a do while loop
    var i: Int = 0
    while (i < listOfNames.size - 1) {
        val item: String = listOfNames[i++]
        println(item)
    }

    // printing the list in a reverse order using kt progressions
    println("Test printing the items in a reverse order : ")
    val reverseList: IntProgression = (listOfNames.size - 1) downTo 0
    for (index in reverseList) {
        val item: String = listOfNames[index]
        println(item)
    }

    //--------------------------------------------------Multi-dimensional arrays----------------------------------------------
    // the 2D array shows how to make a list of lists
    // and we can have 3D and 4D array, examples : Minecraft Game blocks are arranged in multidimensional arrays.
    // listing of some countries' cities
    val array2D: List<List<String>> = listOf(
        listOf("Cairo", "Giza", "Alexandria", "Port Saeed"),
        listOf("Washington DC", "NYC", "California", "NJ"),
        listOf("London", "Manchester", "Dover", "Cambridge")
    )
    print("Egypt has : ")
    for (item in array2D[0]) {
        print("$item, ")
    }
    println()
    print("US has : ")
    for (item in array2D[1]) {
        print("$item, ")
    }
    println()
    print("UK has : ")
    for (item in array2D[2]) {
        print("$item, ")
    }
    println()
    //----------------------------------------------------------------------------------------------------------------

    //------------------------------------------Hybrid Arrays--------------------------------------------------------
    // previously we have discussed that we can make a list of any data type, the list should be only of one data type
    // in this part, we will show you how to make a hybrid list that has different data types

    // to make a hybrid list, use listOf directly without declaring a type or else use List<Any>
    // a list of Strings, numbers and lists
    val hybridList = listOf("Harry", 40u, "Married", "0 Children", listOf<String>( "Physician", "Oxford university"))
    // now let's make this ID card for Harry
    var personalID: String = ""
    var work: String = ""
    // extracting data from our array
    for (item in hybridList) {
        // 'is' keyword in kt checks if the current item is of a specific data type
        // if the item is a list then extract its content
        // otherwise use the item directly
        // <*> means a list of any type and its equivalent <Any?> which means any type is accepted
        if (item is List<*>) {
            for (workItem in item) {
                work += "$workItem \n"
            }
        } else {
            personalID += "$item \n"
        }
    }
    // now print the extracted data
    println("--------------------------------------------------------")
    println("Personal ID : ")
    print(personalID)
    println("Work : ")
    print(work)
    println("--------------------------------------------------------")

    // '<>' are called the generic type angular brackets, they are used to restrict the declaration to a specific type (explicit type inference).
    // using '<Any?>' as a type can even accept nullable types and its equivalent to the wildcard operator '<*>'
    val testHybridList: List<Any?> = listOf(null, 40u, "Married", "0 Children", listOf<String>( "Physician", "Oxford university"))
    testHybridList.forEach {
        println(it)
    }

    //------------------------------------------Dynamic Arrays Using ArrayLists------------------------------------------------------------------
    // Dynamic arrays : are those types of List<*> that are of expandable size by nature.
    // In ArrayLists : adding the elements could be managed after the initialization statement.
    val testDynamicList: ArrayList<Any?> = ArrayList()
    // adding elements to our dynamic array.
    testDynamicList.add("MyName")
    println("My array Size = ${testDynamicList.size}")
    testDynamicList.add(50u)
    println("My array Size = ${testDynamicList.size}")
    testDynamicList.addAll(testHybridList)
    println("My array Size = ${testDynamicList.size}")

    // extract the data from our dynamic array
    for (item0 in testDynamicList) {
        println(item0)
    }
    // to delete all items from our array do call clear() function
    testDynamicList.clear()
    // now let's re-check them
    println("My array Size = ${testDynamicList.size}")
    testDynamicList.forEach{
        println(it)
    }
    //------------------------------------------------------------------------------------------------------------------------------


}



