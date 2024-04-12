import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(float temperature);
}

class WeatherStation {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}

class TemperatureDisplay implements Observer {
    private String location;

    public TemperatureDisplay(String location) {
        this.location = location;
    }

    @Override
    public void update(float temperature) {
        System.out.println("Temperature at " + location + ": " + temperature + "°C");
    }
}
