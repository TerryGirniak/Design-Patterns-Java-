public class Singleton {

    private static Singleton monolithInstance = null;

    private Singleton() { }

    public static Singleton getInstance(){

        if(monolithInstance == null){
            monolithInstance = new Singleton();
        }

        return monolithInstance;
    }

    public void getParameters(){
        System.out.println("10 x 5 x 2");
    }

    public void getInformation(){
        System.out.println("Anyone can change this text");
    }
}
