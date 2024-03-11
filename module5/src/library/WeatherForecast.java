package library;
/**
 * Name: Luping Xing
 * Program: Full Stack Web Development 24Winter
 * Course: Programming-1
 * Created: Mar 1, 2024
 * Updated: Mar 1, 2024
 */

/**
 * A class encapsulating the concept of a weather forecast.
 *
 * @author Luping Xing [lxing2@rrc.ca]
 * @version 1.0.0
 */
public class WeatherForecast {

    /**
     * The temperature of the weather forecast in Fahrenheit.
     */
    private int temperature;

    /**
     * The sky condition of the weather forecast.
     */
    private SkyCondition skyCondition;

    /**
     * The factor used for determining if the weather forecast is consistent.
     */
    public static final int CONSISTENCY_FACTOR = 32;

    /**
     * The minimum possible value of the weather forecast’s temperature.
     */
    public static final int MINIMUM_TEMPERATURE = -50;

    /**
     * The maximum possible value of the weather forecast’s temperature.
     */
    public static final int MAXIMUM_TEMPERATURE = 150;

    /**
     * Initializes a new instance of WeatherForecast class with a temperature of 70 degrees and a sky condition of sunny.
     */
    public WeatherForecast() {
        this.temperature = 70;
        this.skyCondition = SkyCondition.SUNNY;
    }

    /**
     * Initializes a new instance of WeatherForecast class with a specified temperature and a sky condition of sunny.
     * If the specified temperature is a value outside the minimum and maximum temperatures, the temperature is initialized to zero.
     *
     * @param temperature The temperature of the weather forecast.
     */
    public WeatherForecast(int temperature) {
        // determine whether the value of temperature is outside the range;
        if (temperature < MINIMUM_TEMPERATURE || temperature > MAXIMUM_TEMPERATURE) {
            // outside the range
            this.temperature = 0;
        } else {
            // within the range
            this.temperature = temperature;
        }

        // initialize skyCondition to SUNNY
        this.skyCondition = SkyCondition.SUNNY;
    }

    /**
     * Returns the weather forecast’s temperature.
     *
     * @return The weather forecast’s temperature.
     */
    public int getTemperature() {
        return temperature;
    }

    /**
     * Sets the weather forecast’s temperature.
     *
     * @param temperature The temperature of the weather forecast.
     */
    public void setTemperature(int temperature) {
        // The temperature state is only updated when the specified temperature value is between the minimum and maximum values (inclusive).
        if (temperature < MAXIMUM_TEMPERATURE && temperature > MINIMUM_TEMPERATURE) {
            this.temperature = temperature;
        }
    }

    /**
     * Returns the weather forecast’s sky condition.
     *
     * @return The weather forecast’s sky condition.
     */
    public SkyCondition getSkyCondition() {
        return skyCondition;
    }

    /**
     * Sets the weather forecast’s sky condition.
     *
     * @param skyCondition The sky condition of the weather forecast.
     */
    public void setSkyCondition(SkyCondition skyCondition) {
        this.skyCondition = skyCondition;
    }

    /**
     * Returns the celsius temperature of the specified Fahrenheit temperature.
     *
     * @param fahrenheit A temperature in Fahrenheit.
     * @return The celsius temperature of the specified Fahrenheit temperature.
     */
    public int toCelsius(int fahrenheit) {
        return (int) Math.round((fahrenheit - 32) * 5.0 / 9.0);
    }

    /**
     * Returns true when the weather forecast is consistent, otherwise false.
     *
     * @return Boolean value indicates if weather forecast is consistent.
     */
    public boolean isConsistent() {
        if (temperature > CONSISTENCY_FACTOR && skyCondition == SkyCondition.SNOWY) {
            return false;
        } else if (temperature < CONSISTENCY_FACTOR && skyCondition == SkyCondition.RAINY) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Return a String representation of the class.
     *
     * @return A String representation of the class.
     */
    public String toString() {
        return "Current condition: " + temperature + " and is " + skyCondition;
    }
}
