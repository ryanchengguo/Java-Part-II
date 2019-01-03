public class CivilService implements NationalService {
    private int daysLeft;
    
    public CivilService() {
        daysLeft = 362;
    }

    @Override
    public int getDaysLeft() {
        return daysLeft;
    }

    @Override
    public void work() {
        if (daysLeft > 0) {
            daysLeft--;
        }
    }
}
