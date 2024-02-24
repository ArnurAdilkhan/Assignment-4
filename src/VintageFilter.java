import java.awt.image.BufferedImage;

public class VintageFilter implements ImageEditorStrategy{
    @Override
    public BufferedImage applyFilter(BufferedImage image) {
        //code for applying filter
        System.out.println("Applying vintage filter to the image...");
        return image;
    }
}
