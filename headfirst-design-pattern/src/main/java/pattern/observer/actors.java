package pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class actors {

}

interface Subject {
  void registerObserver(Observer o);

  void removeObserver(Observer o);

  void notifyObservers();
}

interface Observer {
  void update(float temp, float humidity, float pressure);
}

interface DisplayElement {
  void display();
}

class WeatherData implements Subject {
  private List<Observer> observerList;
  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData() {
    observerList = new ArrayList<>();
  }

  @Override
  public void registerObserver(Observer o) {
    observerList.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    int idx = observerList.indexOf(o);
    if (idx >= 0) observerList.remove(idx);
  }

  @Override
  public void notifyObservers() {
    observerList.forEach(o -> o.update(temperature, humidity, pressure));
  }

  public void measurementsChanged() {
    notifyObservers();
  }

  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }
}

class CurrenConditionsDisplay implements Observer, DisplayElement {
  private float temperature;
  private float humidity;
  private Subject weatherData;

  @Override
  public void update(float temp, float humidity, float pressure) {
    this.temperature = temp;
    this.humidity = humidity;
    display();
  }

  @Override
  public void display() {
    System.out.println("Current conditions");
    System.out.println(temperature + "F degrees");
    System.out.println(humidity + "% humidity");
  }
}

