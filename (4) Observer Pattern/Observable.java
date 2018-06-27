import java.util.ArrayList;

public class Observable implements Subject{

    private ArrayList<Observer> data;

    private double speed;
    private double distance;
    private double time;

    Observable(){
        data = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {

        data.add(observer);
    }

    @Override
    public void unRegister(Observer observer) {

        data.remove(data.indexOf(observer));
        System.out.println("Unregistered");
    }

    @Override
    public void notifyObserver() {

        for(Observer observer : data){
               observer.update(speed, distance, time);
        }
    }

    public void setSpeed(double speed){
        this.speed = speed;
        notifyObserver();
    }

    public void setDistance(double distance){
        this.distance = distance;
        notifyObserver();
    }

    public void setTime(double time){
        this.time = time;
        notifyObserver();
    }

}
