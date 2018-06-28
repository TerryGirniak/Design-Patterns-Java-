public class FruitsFacade {

    private Fruit apple;
    private Fruit pear;
    private Fruit peach;

    public FruitsFacade(){
        apple = new Apple();
        peach = new Peach();
        pear = new Pear();
    }

    public void appleInfo(){
        apple.characteristics();
    }

    public void peachInfo(){
        peach.characteristics();
    }

    public void pearInfo(){
        pear.characteristics();
    }
}
