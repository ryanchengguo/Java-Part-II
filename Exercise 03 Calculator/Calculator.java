public class Calculator {
    private Reader reader;
    private int numOfCalculations;
    
    public Calculator() {
        reader = new Reader();
        numOfCalculations = 0;
    }

    private int[] getValues() {
        int[] values = new int[2];
        
        System.out.print("value1: ");
        values[0] = reader.readInteger();
        System.out.print("value2: ");
        values[1] = reader.readInteger();
        
        return values;
    }
