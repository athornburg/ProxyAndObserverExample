import jhayes.athornburg.image.BlogContainerImpl;
import jhayes.athornburg.image.BlogObserver;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: alexthornburg
 * Date: 4/7/14
 * Time: 8:27 PM
 */
public class ObserverTest {
    BlogObserver observer1;
    @Before
    public void addIds(){
        int[] ids = {1,2,3,4,5};
        BlogContainerImpl container = new BlogContainerImpl(ids);
        observer1 = new BlogObserver(container);
        observer1.container.setPostTextForPost(0, "Hello World Blog Post");
    }
    @Test
    public void testObserver(){
        assertEquals("Hello World Blog Post",observer1.container.getPosts().get(0).getPostText());
        assertEquals("Post 2",observer1.container.getPosts().get(1).getPostText());
        assertEquals("Post 3",observer1.container.getPosts().get(2).getPostText());
        assertEquals("Post 4",observer1.container.getPosts().get(3).getPostText());
        assertEquals("Post 5",observer1.container.getPosts().get(4).getPostText());

    }

    @Test
    public void testChangePost(){
        observer1.container.setPostTextForPost(0, "New Blog Post");
        assertEquals("New Blog Post",observer1.container.getPosts().get(0).getPostText());
        observer1.container.setPostTextForPost(1, "This should work too");
        assertEquals("This should work too",observer1.container.getPosts().get(1).getPostText());
    }


}
