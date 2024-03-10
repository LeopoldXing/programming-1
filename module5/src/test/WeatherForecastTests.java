package test;
/**
 * Name: Luping Xing
 * Program: Full Stack Web Development 24Winter
 * Course: Programming-1
 * Created: Mar 1, 2024
 * Updated: Mar 1, 2024
 */
import library.SkyCondition;
import library.WeatherForecast;

/**
 * A class for WeatherForecast and SkyCondition testing.
 *
 * @author Luping Xing [lxing2@rrc.ca]
 * @version 1.0.0
 */
public class WeatherForecastTests {
    public static void main(String[] args) {
        // Test Unit: WeatherForecast(int)
        System.out.println("WeatherForecast(int)");
        // Test #1 - Initialize the temperature with a value below the minimum.
        System.out.println("Test #1 - Initialize the temperature with a value below the minimum.");
        WeatherForecast weatherForecast = new WeatherForecast(-100);
        System.out.println("Expected: 0");
        System.out.println("Actual: " + weatherForecast.getTemperature());
        System.out.println();

        // Initialize the temperature to the minimum temperature.
        System.out.println("Test #2 - Initialize the temperature to the minimum temperature.");
        weatherForecast = new WeatherForecast(-50);
        System.out.println("Expected: -50");
        System.out.println("Actual: " + weatherForecast.getTemperature());
        System.out.println();

        // Initialize the temperature within the range.
        System.out.println("Test #3 - Initialize the temperature within the range.");
        weatherForecast = new WeatherForecast(100);
        System.out.println("Expected: 100");
        System.out.println("Actual: " + weatherForecast.getTemperature());
        System.out.println();

        // Initialize the temperature the to the maximum temperature.
        System.out.println("Test #4 - Initialize the temperature the to the maximum temperature.");
        weatherForecast = new WeatherForecast(150);
        System.out.println("Expected: 150");
        System.out.println("Actual: " + weatherForecast.getTemperature());
        System.out.println();

        // Initialize the temperature above the maximum temperature.
        System.out.println("Test #5 - Initialize the temperature above the maximum temperature.");
        weatherForecast = new WeatherForecast(200);
        System.out.println("Expected: 0");
        System.out.println("Actual: " + weatherForecast.getTemperature());
        System.out.println();

        // Initialize the sky condition.
        System.out.println("Test #6 - Initialize the sky condition.");
        weatherForecast = new WeatherForecast(100);
        System.out.println("Expected: SUNNY");
        System.out.println("Actual: " + weatherForecast.getSkyCondition());
        System.out.println();


        // Test Unit: WeatherForecast()
        System.out.println("WeatherForecast()");
        // Initialize the temperature.
        System.out.println("Test #7 - Initialize the temperature.");
        weatherForecast = new WeatherForecast();
        System.out.println("Expected: 70");
        System.out.println("Actual: " + weatherForecast.getTemperature());
        System.out.println();

        // Initialize the sky condition.
        System.out.println("Test #8 - Initialize the sky condition.");
        weatherForecast = new WeatherForecast();
        System.out.println("Expected: SUNNY");
        System.out.println("Actual: " + weatherForecast.getSkyCondition());
        System.out.println();


        // Test Unit: setTemperature(int) : void
        System.out.println("setTemperature(int) : void");
        // Update the state of the temperature with a value below the minimum.
        System.out.println("Test #9 - Update the state of the temperature with a value below the minimum.");
        weatherForecast = new WeatherForecast();
        weatherForecast.setTemperature(-1000);
        System.out.println("Expected: 70");
        System.out.println("Actual: " + weatherForecast.getTemperature());
        System.out.println();

        // Update the state of the temperature to the minimum temperature.
        System.out.println("Test #10 - Update the state of the temperature to the minimum temperature.");
        weatherForecast = new WeatherForecast();
        weatherForecast.setTemperature(-50);
        System.out.println("Expected: 70");
        System.out.println("Actual: " + weatherForecast.getTemperature());
        System.out.println();

        // Update the state of the temperature within the range.
        System.out.println("Test #11 - Update the state of the temperature within the range.");
        weatherForecast = new WeatherForecast();
        weatherForecast.setTemperature(0);
        System.out.println("Expected: 0");
        System.out.println("Actual: " + weatherForecast.getTemperature());
        System.out.println();

        // Update the state of the temperature the to the maximum temperature.
        System.out.println("Test #12 - Update the state of the temperature the to the maximum temperature.");
        weatherForecast = new WeatherForecast();
        weatherForecast.setTemperature(150);
        System.out.println("Expected: 70");
        System.out.println("Actual: " + weatherForecast.getTemperature());
        System.out.println();

        // Update the state of the temperature above the maximum temperature.
        System.out.println("Test #13 - Update the state of the temperature above the maximum temperature.");
        weatherForecast = new WeatherForecast();
        weatherForecast.setTemperature(2000);
        System.out.println("Expected: 70");
        System.out.println("Actual: " + weatherForecast.getTemperature());
        System.out.println();


        // Test Unit: setSkyCondition(SkyCondition) : void
        System.out.println("setSkyCondition(SkyCondition) : void");
        // Update state of sky condition.
        System.out.println("Test #14 - Update state of sky condition.");
        weatherForecast = new WeatherForecast();
        weatherForecast.setSkyCondition(SkyCondition.RAINY);
        System.out.println("Expected: RAINY");
        System.out.println("Actual: " + weatherForecast.getSkyCondition());
        System.out.println();


        // Test Unit: (static) toCelsius(int) : int
        System.out.println("(static) toCelsius(int) : int");
        // Returns the temperature in Celsius.
        System.out.println("Test #15 - Returns the temperature in Celsius.");
        System.out.println("Expected: 49");
        System.out.println("Actual: " + weatherForecast.toCelsius(120));
        System.out.println();


        // Test Unit: isConsistent() : boolean
        System.out.println("isConsistent() : boolean");
        // The temperature is too hot for snow.
        System.out.println("Test #16 - The temperature is too hot for snow.");
        weatherForecast = new WeatherForecast();
        weatherForecast.setSkyCondition(SkyCondition.SNOWY);
        System.out.println("Expected: false");
        System.out.println("Actual: " + weatherForecast.isConsistent());
        System.out.println();

        // The temperature is cold enough for snow.
        System.out.println("Test #17 - The temperature is cold enough for snow.");
        weatherForecast = new WeatherForecast(-49);
        weatherForecast.setSkyCondition(SkyCondition.SNOWY);
        System.out.println("Expected: true");
        System.out.println("Actual: " + weatherForecast.isConsistent());
        System.out.println();

        // The temperature is too cold for rain.
        System.out.println("Test #18 - The temperature is too cold for rain.");
        weatherForecast = new WeatherForecast(-49);
        weatherForecast.setSkyCondition(SkyCondition.RAINY);
        System.out.println("Expected: false");
        System.out.println("Actual: " + weatherForecast.isConsistent());
        System.out.println();

        // The temperature is warm enough for rain.
        System.out.println("Test #19 - The temperature is warm enough for rain.");
        weatherForecast = new WeatherForecast(70);
        weatherForecast.setSkyCondition(SkyCondition.RAINY);
        System.out.println("Expected: true");
        System.out.println("Actual: " + weatherForecast.isConsistent());
        System.out.println();

        // Test Unit: toString() : String
        System.out.println("toString() : String");
        // Returns the correct String representation.
        System.out.println("Test #20 - Returns the correct String representation.");
        weatherForecast = new WeatherForecast(140);
        weatherForecast.setSkyCondition(SkyCondition.RAINY);
        System.out.println("Expected: Current condition: 140 and is RAINY");
        System.out.println("Actual: " + weatherForecast);
        System.out.println();
    }
}
