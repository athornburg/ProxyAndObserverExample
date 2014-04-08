package jhayes.athornburg.image;

/**
 * User: alexthornburg
 * Date: 4/6/14
 * Time: 8:29 PM
 */
public class Driver {
    public static void main(String[] args){
        int[] ids = {1,2,3,4,5};
        BlogContainerImpl container = new BlogContainerImpl(ids);
        BlogObserver observer1 = new BlogObserver(container);
        BlogObserver observer2 = new BlogObserver(container);
        observer1.container.setPostTextForPost(0, "Hello World Blog Post");
        observer1.container.notifyObservers();
        System.out.println(observer1.container.getPosts().get(0).getPostText());

    }
}
