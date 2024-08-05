public class ProxyPatternTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // The image will be loaded and displayed
        image1.display();

        // The image is already loaded, so it will just be displayed
        image1.display();

        // The image will be loaded and displayed
        image2.display();
    }
}
