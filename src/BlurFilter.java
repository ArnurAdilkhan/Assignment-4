import java.awt.image.BufferedImage;

public class BlurFilter implements ImageEditorStrategy{
    @Override
    public BufferedImage applyFilter(BufferedImage image) {
        //some code for applying filter
        System.out.println("Applying blur filter to image...");
        return image;
    }
}
