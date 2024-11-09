import java.util.ArrayList;
import java.util.List;

public class Bar {
    public Boolean isHappy;
    private List<BarObserver> observers;

    public Bar() {
        observers = new ArrayList<>();
    }

    void startHappyHour() {
    }

    ;

    void endHappyHour() {
    }

    ;

    boolean isHappyHour() {
        return false;
    }

    ;

    void addObserver(BarObserver observer) {

        observers.add(observer);

    }

    void removeObserver(BarObserver observer) {

        observers.remove(observer);

    }

    void notifyObservers() {
        if (observers != null) {
            for (BarObserver observer : observers) {
                if (isHappyHour()) observer.happyHourStarted(this);
                else observer.happyHourEnded(this);
            }
        }
    }

}