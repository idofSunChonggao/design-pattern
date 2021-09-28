package observer;

/**
 * @Author SunChonggao
 * @Date 2021-09-09 11:16
 * @Version 1.0
 * @Description：
 */
public class ObserverTest {
    public static void main(String[] args) {

        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserverA observerA = new ConcreteObserverA(subject);
        ConcreteObserverB observerB = new ConcreteObserverB(subject);
        subject.setState(1);
        System.out.println(observerA.toString());
        System.out.println(observerB.toString());
    }
}
