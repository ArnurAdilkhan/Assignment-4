import java.awt.image.BufferedImage;

public class ImgProcessor {
    private ImageEditorStrategy editorStrategy;

    public void setEditorStrategy(ImageEditorStrategy editorStrategy) {
        this.editorStrategy = editorStrategy;
    }
    public BufferedImage applyFilter(BufferedImage image){
        return editorStrategy.applyFilter(image);
    }
}