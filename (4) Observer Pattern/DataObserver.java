public class DataObserver implements Observer{

    private double speed;
    private double distance;
    private double time;

    private static int observerIdTracker = 0;

    DataObserver(Subject subject){

        int observerID = ++observerIdTracker;

        subject.register(this);
        System.out.println("Current Observer ID: " + observerID + "\n");
    }

    @Override
    public void update(double speed, double distance, double time) {

        this.speed = speed;
        this.distance = distance;
        this.time = time;

        print();
    }

    private void print(){
        System.out.println("Speed: " + speed + "\nDistance: " + distance + "\nTime: " + time +"\n");
    }
}
