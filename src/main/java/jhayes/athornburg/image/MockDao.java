package jhayes.athornburg.image;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by john on 4/7/2014.
 */
public class MockDao {



    public MockDao(){

    }

    public BlogPost GetPost(int id) throws IOException {
        BlogPost post = new BlogPostImpl(id);
        post.setPostText("Post " + id);
        post.setImages(GetImagesForPost(id));

        return post;

    }

    public List<byte[]> GetImagesForPost(int postId) throws IOException {

        //mock object just gets random files to simulate dao postId not actually used
        List<byte[]> images = new ArrayList<byte[]>();

        for(int i = 0; i < postId; i++) {

            File fi = new File("Images/theImage.jpg");
            byte[] fileContent = Files.readAllBytes(fi.toPath());

            images.add(fileContent);

        }
        return images;
    }

}
