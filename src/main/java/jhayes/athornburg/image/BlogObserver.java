package jhayes.athornburg.image;

/**
 * Created by john on 4/7/2014.
 */
public class BlogObserver implements  ObserverObject {


    public BlogContainerImpl container;

    public BlogObserver(BlogContainerImpl container){
        this.container = container;
        container.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Posts updated");
        for(BlogPost bp:container.getState()){
            System.out.println("Post id: "+ bp.getId());
            System.out.println("Post: "+ bp.getPostText());

            System.out.println("Number of images: "+ bp.getImages().size());
        }
    }
}
