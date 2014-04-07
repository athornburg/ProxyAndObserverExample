package jhayes.athornburg.image;

/**
 * Created by john on 4/7/2014.
 */
public interface ObservableObject {
    void attach(ObserverObject object);
    void detatch(ObserverObject object);
    void notifyObservers();


}
