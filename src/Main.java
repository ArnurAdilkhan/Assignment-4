import java.awt.image.BufferedImage;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BufferedImage image = new BufferedImage(250, 250, BufferedImage.TYPE_4BYTE_ABGR);
        ImgProcessor imgProcessor = new ImgProcessor();
        System.out.println("Welcome to application for implementing filter on image!");
        System.out.println("________________");
        System.out.println("1. Walden filter");
        System.out.println("2. Blur filter");
        System.out.println("3. Vintage filter");
        System.out.println("4. Glitch filter");
        System.out.println("Choose filter that you want to implement:");
        int choose = scanner.nextInt();
        if (choose == 1){
            imgProcessor.setEditorStrategy(new WaldenFilter());
            BufferedImage waldenImage = imgProcessor.applyFilter(image);
        } else if (choose == 2) {
            imgProcessor.setEditorStrategy(new BlurFilter());
            BufferedImage blurImage = imgProcessor.applyFilter(image);
        } else if (choose == 3) {
            imgProcessor.setEditorStrategy(new VintageFilter());
            BufferedImage vintageImage = imgProcessor.applyFilter(image);
        } else if (choose == 4) {
            imgProcessor.setEditorStrategy(new GlitchFilter());
            BufferedImage glitchImage = imgProcessor.applyFilter(image);
        }
    }
}