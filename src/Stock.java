import java.lang.reflect.Array;
import java.util.ArrayList;

public class Stock implements Subject{

    private int price;
    ArrayList<Observer> Investors;
    public Stock()
    {
        Investors = new ArrayList<Observer>();
    }
    public void setPrice(int price) {
        this.price = price;
        notifyObservers();
    }
    @Override
    public void registerObserver(Observer observer) {
        Investors.add(observer);
    }

    @Override
    public void unRegisterObserver(Observer observer) {
        Investors.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: Investors)
        {
            observer.update(price);
        }
    }
}
