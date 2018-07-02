public class Main {

    public static void main(String[] args) {

        Item centurionStatue = new Item("Centurion statue");
        Item waterBottle = new Item("Water bottle");
        Item wallet = new Item("Wallet");

        Shelf shelf = new Shelf();

        shelf.putItem(centurionStatue);
        shelf.putItem(wallet);

        shelf.takeItem(waterBottle);

        shelf.displayItems();
    }
}
