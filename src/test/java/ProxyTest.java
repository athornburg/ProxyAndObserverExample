import jhayes.athornburg.image.BlogPostProxy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: alexthornburg
 * Date: 4/7/14
 * Time: 8:48 PM
 */
public class ProxyTest {
    BlogPostProxy proxy;

    @Before
    public void setup(){
       proxy = new BlogPostProxy(1);
    }

    @Test
    public void addText(){
        proxy.setPostText("This is a test");
        assertEquals("This is a test",proxy.getPostText());
    }
}
