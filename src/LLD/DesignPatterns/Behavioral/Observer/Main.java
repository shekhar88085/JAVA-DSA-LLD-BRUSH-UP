package LLD.DesignPatterns.Behavioral.Observer;

public class Main {
    public static void main(String[] args) {
        // Create weather data and observers
        WeatherData weatherData = new WeatherData();
        
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        // Simulate new weather data
        weatherData.setWeatherData(80, 65, 30.4f);
        weatherData.setWeatherData(82, 70, 29.2f);
        weatherData.setWeatherData(78, 90, 29.2f);
    }
}