public class SquareTable implements Table {

    @Override
    public void deck() {
        System.out.println("Regular maple deck");
    }

    @Override
    public void tableLegs() {
        System.out.println("Regular maple table legs");
    }

    @Override
    public boolean ornaments() {
        return false;
    }
}
