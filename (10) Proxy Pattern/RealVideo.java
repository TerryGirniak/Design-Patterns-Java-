public class RealVideo implements Video {

    private String videoName;

    RealVideo(String videoName){
        this.videoName = videoName;
        load();
    }

    @Override
    public void play() {
        System.out.println("Video called \"" + videoName + "\" is being played...");
    }

    @Override
    public void stop() {
        System.out.println("Video called \"" + videoName + "\" is stopped");
    }

    private void load() {

        System.out.println("Loading video....");

        try {
            Thread.sleep(1000 * 3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
