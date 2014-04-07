package jhayes.athornburg.image;

import java.util.Observable;
import java.util.Observer;

/**
 * User: alexthornburg
 * Date: 4/6/14
 * Time: 8:07 PM
 */
public class ProxyView implements Observer {
    private ImageView image = null;
    private String fileName = null;

    public ProxyView(final String fileName) {
        this.fileName = fileName;
    }

    public void displayImage() {
        if (image == null) {
            image = new ImageView(fileName);
        }
        image.displayImage();
    }

    @Override
    public void update(Observable o, Object arg) {
            if (arg instanceof String) {
                fileName = (String) arg;
                System.out.println("\nFile location changed " + fileName );
            }
        }
}
