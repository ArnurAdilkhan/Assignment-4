import java.awt.image.BufferedImage;

public interface ImageEditorStrategy {
   BufferedImage applyFilter(BufferedImage image);
}
