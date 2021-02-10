package WeatherMonitoringStation;

public class ForecastDisplay implements Observer, DisplayElement{

    float temperature;
    float humidity;
    float pressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public void display() {

    }

}
