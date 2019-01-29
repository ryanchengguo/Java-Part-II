package application;

import java.util.Random;

public class Thermometer implements Sensor {
  
  private boolean on;
    
    public Thermometer() {
        on = false;
    }
    
    @Override
    public boolean isOn() {
        return on;
    }
  
    @Override
    public void on() {
        on = true;
    }
  
    @Override
    public void off() {
        on = false;
    }
 
    @Override
    public int measure() {
        if (on) {
            Random random = new Random();
            return random.nextInt(61) - 30;
        } else {
            throw new IllegalStateException();
        }
    }
  
}
