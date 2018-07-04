public class HammerAdapter implements UsingAxe{

    private Hammer hammer = new Hammer();

    @Override
    public void chop() {
        hammer.hit();
    }

    @Override
    public void cut() {
        hammer.smash();
    }
}
