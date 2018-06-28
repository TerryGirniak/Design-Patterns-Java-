public class Main {

    public static void main(String[] args) {

        Table regularTable = new SquareTable();
        Table decoratedGlassTable = new GlassTableDecorator(new SquareTable());

        System.out.println("Regular Table: \n");

        regularTable.deck();
        regularTable.tableLegs();
        System.out.println("Has ornaments: " + regularTable.ornaments());

        System.out.println();

        System.out.println("Decorated Table: \n");

        decoratedGlassTable.deck();
        decoratedGlassTable.tableLegs();
        System.out.println("Has ornaments: " + decoratedGlassTable.ornaments());
    }
}
