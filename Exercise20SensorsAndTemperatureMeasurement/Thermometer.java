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
  
  
 
  
}
