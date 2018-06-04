public class Main {

    public static void main(String[] args){

        Singleton monolith = Singleton.getInstance();

        System.out.println(" First instantiation: ");
        monolith.getInformation();
        monolith.getParameters();

        Singleton secondMonolith = Singleton.getInstance();

        System.out.println("\n Second instantiation: ");
        secondMonolith.getInformation();
        secondMonolith.getParameters();
    }
}
