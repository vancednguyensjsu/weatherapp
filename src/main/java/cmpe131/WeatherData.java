package cmpe131;

public class WeatherData {
    private double temperature;
    private double humidity;
    private double wind;

    public WeatherData(double temperature, double humidity, double wind) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.wind = wind;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getWind() {
        return wind;
    }

    @Override
    public String toString() {
        return "Temperature: " + temperature + "°C, Humidity: " + humidity + "%, Wind: " + wind + " Mph";
    }
}
