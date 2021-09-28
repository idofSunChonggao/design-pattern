package observer;

/**
 * @Author SunChonggao
 * @Date 2021-09-08 11:03
 * @Version 1.0
 * @Description：
 */
public interface Subject {
    /**
     * register a observer, add it into list
     * @param o a instance of Observer
     */
    void registerObserver(Observer o);

    /**
     * delete a observer, remove it from list
     * @param o a instance of Observer
     */
    void removeObserver(Observer o);

    /**
     * when the state of subject changed, this method is called to notify observers
     */
    void notifyObservers();
}
