public class Main {

    public static void main(String[] args) {

        Observable dataObservable = new Observable();

        DataObserver observer = new DataObserver(dataObservable);

        dataObservable.setSpeed(60);
        dataObservable.setDistance(1200);
        dataObservable.setTime(60 * 1000);

        dataObservable.unRegister(observer);
    }
}
