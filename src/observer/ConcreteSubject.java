package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author SunChonggao
 * @Date 2021-09-08 17:17
 * @Version 1.0
 * @Description：
 */
public class ConcreteSubject implements Subject{
    private List<Observer> observers;
    private int state;

    public ConcreteSubject() {
        observers = new ArrayList<>();
    }


    /**
     * register a observer, add it into list
     *
     * @param o a instance of Observer
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * delete a observer, remove it from list
     *
     * @param o a instance of Observer
     */
    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if(index >= 0) {
            observers.remove(index);
        }
    }

    /**
     * when the state of subject changed, this method is called to notify observers
     */
    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(state);
        }
    }

    public void stateChanged() {
        notifyObservers();
    }
    public void setState(int state) {
        this.state = state;
        stateChanged();
    }

}
