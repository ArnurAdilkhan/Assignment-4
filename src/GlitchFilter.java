import java.awt.image.BufferedImage;

public class GlitchFilter implements ImageEditorStrategy{
    @Override
    public BufferedImage applyFilter(BufferedImage image) {
        //code for applying filter
        System.out.println("Applying glitch filter to the image...");
        return image;
    }
}
