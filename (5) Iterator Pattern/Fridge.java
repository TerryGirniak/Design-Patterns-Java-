import java.util.ArrayList;

public class Fridge implements Container {

    private ArrayList<String> products = new ArrayList<>();

    @Override
    public Iterator getIterator() {
        return null;
    }

    public void addProduct(String product){
        products.add(product);
    }

    private class ArmyIterator implements Iterator {

        private int index;

        @Override
        public boolean hasNext() {

            return index < products.size();
        }

        @Override
        public Object next() {
            if(this.hasNext()) {
                return products.get(index++);
            } else {
                return null;
            }
        }
    }
}
