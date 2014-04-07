package jhayes.athornburg.image;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by john on 4/7/2014.
 */
public class BlogContainerImpl implements BlogContainer, ObservableObject {

    List<BlogPost> posts;
    ArrayList<ObserverObject> observerObjects;

    public BlogContainerImpl(int[] ids){
        posts = new ArrayList<BlogPost>();
        observerObjects = new ArrayList<ObserverObject>();
        for(int id:ids){
            posts.add(new BlogPostProxy(id));

        }
    }

    @Override
    public List<BlogPost> getPosts() {
        return posts;
    }

    //this is the method that will trigger the post to update which on the first time will
    //trigger the proxy to load the real object
    @Override
    public void setPostTextForPost(int index, String postText) {
        int size = posts.size();
        if(index > -1 && index < size && size > 0){
            posts.get(index).setPostText(postText);
            notifyObservers();
        }
    }


    @Override
    public void attach(ObserverObject object) {
        observerObjects.add(object);
    }

    @Override
    public void detatch(ObserverObject object) {
        observerObjects.remove(object); // we will assmume a working compareto method for objects
    }

    @Override
    public void notifyObservers() {
        for(ObserverObject obj: observerObjects){
            obj.update();
        }
    }

    @Override
    public List<BlogPost> getState() {
        return posts;
    }
}
