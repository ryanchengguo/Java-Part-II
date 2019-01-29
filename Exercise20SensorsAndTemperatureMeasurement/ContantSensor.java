package application;

public class ConstantSensor implements Sensor {
  
  private int reading;

    public ConstantSensor(int reading) {
        this.reading = reading;
    }
}
