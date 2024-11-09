public class StringBar extends Bar{

    public StringBar(){
       isHappy = false;
    }

    @Override
    public void startHappyHour() {
        isHappy = true;
        notifyObservers();
    }

    @Override
    public void endHappyHour() {
        isHappy = false;
        notifyObservers();
    }

    @Override
    public boolean isHappyHour() {
        return isHappy;
    }

}
