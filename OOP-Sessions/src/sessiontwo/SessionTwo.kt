package sessiontwo

/**
 * SessionTwo file.
 * Discusses inheritance principles and extensibility of features across classes.
 *
 * @author pavl_g.
 */

/**
 * A car class with a primary constructor.
 * To add more functionalities to a car such as more speed and more stamina, extend it.
 * Notes :
 * - By default classes in kotlin are public final, so we have used open to make the class
 * extendable.
 * - The car has a protected constructor, it cannot be called directly, you must extend it.
 */
open class Car protected constructor(private val brand: String) {
    /**
     * Model is determined by the children cars.
     */
    private lateinit var model: String

    /**
     * Nitro car power
     */
    private var nitroPower: Float = 0.0f

    /**
     * base car speed is 20km/hr/
     */
    private val baseSpeed: Float = 120f

    /**
     * Sets the car model.
     * @param model the car model.
     */
    fun setModel(model: String): Unit {
        this.model = model
    }

    /**
     * Sets the nitro power.
     * @param nitroPower the nitro power value.
     */
    fun setNitroPower(nitroPower: Float): Unit {
        this.nitroPower = nitroPower
    }

    /**
     * Gets the nitro power.
     */
    fun getNitroPower(): Float {
        return nitroPower
    }

    /**
     * Gets the car model.
     * @return car model in string.
     */
    open fun getModel(): String {
        return model
    }

    /**
     * Gets the car brand.
     * @return car brand in strings.
     */
    fun getBrand(): String{
        return brand
    }

    fun getMaxSpeed(): Float {
        return baseSpeed + nitroPower
    }

    /**
     * Converts the car details into a string format.
     */
    override fun toString(): String {
        return getModel()
    }
}

/*
 * Now all these car brands inherit all the functions of the Car class
 * and you can even add on them and/or change the open functions.
 */

/**
 * Any ford car can extend this class and features on it.
 */
open class Ford: Car("Ford") {
    /**
     * The car chassis color.
     */
    protected var chassisColor: String = "White"

    /**
     * Override and add the brand to the car model name.
     */
    override fun getModel(): String {
        return super.getModel() + " : " + getBrand()
    }

    /**
     * Converts the car details into a string format.
     */
    override fun toString(): String {
        return super.toString() + " : Max Speed : " + getMaxSpeed()
    }
}

/**
 * Any Chevy car can extend this class and features on it.
 */
open class Chevy: Car("Chevy") {
    /**
     * Override and add the brand to the car model name.
     */
    override fun getModel(): String {
        return super.getModel() + " " + getBrand()
    }

    /**
     * Converts the car details into a string format.
     */
    override fun toString(): String {
        return super.toString() + " : Max Speed : " + getMaxSpeed()
    }
}

/**
 * Any Mit car can extend this class and features on it.
 */
open class Mitsubishi: Car("Mitsubishi") {
    /**
     * Override and add the brand to the car model name.
     */
    override fun getModel(): String {
        return super.getModel() + " " + getBrand()
    }

    /**
     * Converts the car details into a string format.
     */
    override fun toString(): String {
        return super.toString() + " : Max Speed : " + getMaxSpeed()
    }
}

/**
 * A new ford car.
 */
open class Escort: Ford() {
    init {
        // initialize defaults for the Escort
        chassisColor = "Black"
        setModel("Escort 200")
        setNitroPower(300f)
    }

    override fun toString(): String {
        return super.toString() + " : Available Color : " + chassisColor
    }
}

/**
 * The application entry point
 */
fun main() {
    // setting values
    val mustang: Car = Ford()
    mustang.setModel("Mustang Mach-E")
    mustang.setNitroPower(200f)

    val camaro: Car = Chevy()
    camaro.setModel("Chevy Camaro 2022")
    camaro.setNitroPower(500f)

    val escort = Escort()

    // printing values
    val cars: Array<Car> = arrayOf(mustang, camaro, escort)
    for (car in cars) {
        println(car.getModel())
        println(car.toString())
    }
}