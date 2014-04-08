package jhayes.athornburg.image;

import java.io.IOException;
import java.util.List;

/**
 * Created by john on 4/7/2014.
 */
public class BlogPostProxy implements BlogPost{

    private int id;
    private BlogPost post;
    private MockDao dao = new MockDao();

    public BlogPostProxy(int id){
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getPostText() {
        if(post == null){
            try {
                post = dao.getPost(id);
                return post.getPostText();
            } catch (IOException e) {
                e.printStackTrace();
                return "There was an error getting the post.";
            }
        }
        else return post.getPostText();

    }

    @Override
    public void setPostText(String postText) {
        if(post == null){
            try {
                post = dao.getPost(id);
                post.setPostText(postText);
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
        else  post.setPostText(postText);
    }

    @Override
    public List<byte[]> getImages() {
        if(post == null){
            try {
                post = dao.getPost(id);
                return post.getImages();
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
        else return post.getImages();
        return null;//error getting images
    }

    @Override
    public void setImages(List<byte[]> images) {
        if(post == null){
            try {
                post = dao.getPost(id);
                post.setImages(images);
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
        else  post.setImages(images);
    }
}
