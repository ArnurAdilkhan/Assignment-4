import java.awt.image.BufferedImage;

public class WaldenFilter implements ImageEditorStrategy{
    @Override
    public BufferedImage applyFilter(BufferedImage image) {
        //code for applying filter
        System.out.println("Applying walden filter to the image...");
        return image;
    }
}
