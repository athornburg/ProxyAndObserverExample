package jhayes.athornburg.image;

import java.util.List;

/**
 * Created by john on 4/7/2014.
 */
public interface BlogPost {



    String getPostText();
    void setPostText(String post);
    List<byte[]> getImages();
    void setImages(List<byte[]> images);
}
