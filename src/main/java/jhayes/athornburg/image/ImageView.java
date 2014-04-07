package jhayes.athornburg.image;

import java.util.Observable;

/**
 * User: alexthornburg
 * Date: 4/6/14
 * Time: 8:03 PM
 */
public class ImageView extends Observable implements Image {
    private String fileName = null;

    public ImageView(String fileName){
        this.fileName = fileName;
    }

    private void loadImageFromDisk() {
        System.out.println("Loading   " + fileName);
    }

    @Override
    public void displayImage() {
        System.out.println("displayed!");
        System.out.println("(╯°□°）╯︵ ┻━┻");

    }

    public void run(){
        notifyObservers(fileName);
        loadImageFromDisk();
        displayImage();

    }
}
