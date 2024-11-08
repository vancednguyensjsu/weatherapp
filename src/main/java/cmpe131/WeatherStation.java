package cmpe131;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation {
    private List<WeatherData> dataRecords;

    public WeatherStation() {
        dataRecords = new ArrayList<>();
    }

    public void collectData() {
        double temperature = 73; // Simulated temperature between 15-30°C
        double humidity = 25; // Simulated humidity between 30-80%
        double wind = 9; // Simulated pressure between 950-1000 hPa

        WeatherData data = new WeatherData(temperature, humidity, wind);
        dataRecords.add(data);
        System.out.println("Collected Data: " + data);
    }

    public void displayAllData() {
        System.out.println("\nStored Weather Data:");
        for (WeatherData data : dataRecords) {
            System.out.println(data);
        }
    }

    public void analyzeData() {
        if (dataRecords.isEmpty()) {
            System.out.println("No data to analyze.");
            return;
        }

        double totalTemp = 0;
        double totalHumidity = 0;
        double totalWind = 0;

        for (WeatherData data : dataRecords) {
            totalTemp += data.getTemperature();
            totalHumidity += data.getHumidity();
            totalWind += data.getWind();
        }

        int count = dataRecords.size();
        System.out.println("\nData Analysis:");
        System.out.printf("Average Temperature: %.2f°C%n", totalTemp / count);
        System.out.printf("Average Humidity: %.2f%%%n", totalHumidity / count);
        System.out.printf("Average Pressure: %.2f Mph%n", totalWind / count);
    }
}