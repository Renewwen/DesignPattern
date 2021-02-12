package WeatherMonitoringStation;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        weatherData.registerObserver(currentConditionsDisplay);
        weatherData.registerObserver(heatIndexDisplay);
        weatherData.setMeasurements(89,15,15);
    }

}
