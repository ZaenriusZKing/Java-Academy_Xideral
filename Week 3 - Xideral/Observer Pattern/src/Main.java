package Observer_Pattern_Code;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        weatherData.registerObserver(currentDisplay);
        weatherData.registerObserver(statisticsDisplay);

        // Simulate new weather measurements
        weatherData.setMeasurements(25.0f, 65.0f, 1013.1f);
        weatherData.setMeasurements(27.5f, 70.0f, 1012.5f);
        weatherData.setMeasurements(23.3f, 90.0f, 1011.8f);
    }
}
	