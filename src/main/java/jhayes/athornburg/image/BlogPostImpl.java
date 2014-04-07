package jhayes.athornburg.image;

import java.util.List;

/**
 * Created by john on 4/7/2014.
 */
public class BlogPostImpl implements BlogPost {

    private String postText;
    private List<byte[]> images;
    private int id;


    public BlogPostImpl(int id){
        this.id = id;

    }

    @Override
    public String getPostText() {
        return postText;
    }

    @Override
    public void setPostText(String post) {
        this.postText = post;
    }

    @Override
    public List<byte[]> getImages() {
        return images;
    }

    @Override
    public void setImages(List<byte[]> images) {
        this.images = images;
    }

}
