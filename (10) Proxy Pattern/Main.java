public class Main {

    public static void main(String[] args) {

        Video video = new ProxyVideo("Space");

        video.play();
        video.stop();
    }
}
