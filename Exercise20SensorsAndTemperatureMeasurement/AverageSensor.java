package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    
    private List<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor() {
        sensors = new ArrayList<Sensor>();
        readings = new ArrayList<Integer>();
    }

    public void addSensor(Sensor additional) {
        sensors.add(additional);
    }
    
    public List<Integer> readings() {
        return readings;
    }

    @Override
    public boolean isOn() {
        for (Sensor s : sensors) {
            if (!s.isOn()) {
                return false;
            }
        }
        
        return true;
    }


    @Override
    public void on() {
        for (Sensor s : sensors) {
            s.on();
        }
    }
    
    @Override
    public void off() {
        for (Sensor s : sensors) {
            s.off();
        }
    }

    @Override
    public int measure() {
        if (!isOn() || sensors.size() == 0) {
            throw new IllegalStateException();
        }
        
        int total = 0;
        
        for (Sensor s : sensors) {
            total += s.measure();
        }
