public class Main {

    public static void main(String[] args) {

        Fridge fridge = new Fridge();

        fridge.addProduct("Milk");
        fridge.addProduct("Eggs");
        fridge.addProduct("Meat");

        Iterator fridgeIterator = fridge.getIterator();

        while(fridgeIterator.hasNext()){
            System.out.println(fridgeIterator.next());
        }
    }

}
