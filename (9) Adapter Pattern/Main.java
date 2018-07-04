public class Main {

    public static void main(String[] args) {

        HammerAdapter hammerAdapter = new HammerAdapter();
        Axe axe = new Axe();

        axe.chop();
        axe.cut();

        System.out.println("\nHammer Adapter:\n");

        hammerAdapter.chop();
        hammerAdapter.cut();
    }
}
