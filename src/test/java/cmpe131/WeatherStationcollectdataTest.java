package cmpe131;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeatherStationcollectdataTest {

    @Test
    void testweathercollection() {
        double temperature = 73;
        double humidity = 25;
        double wind = 9;
        var collection = new WeatherStation();
        String test = "Temperature: " + temperature + "°C, Humidity: " + humidity + "%, Wind: " + wind + " Mph";
        assertEquals(test, collection.collectData().toString());
    }
}