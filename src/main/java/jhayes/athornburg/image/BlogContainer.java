package jhayes.athornburg.image;

import java.util.List;
import java.util.Observable;

/**
 * Created by john on 4/7/2014.
 */
public interface BlogContainer{

    List<BlogPost> getPosts();
    void addObserver(ObserverObject observer);

}
