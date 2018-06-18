public class Rocket implements RocketPlan{

    private String rocketNoseCone;
    private String rocketFrame;
    private String rocketFin;

    @Override
    public void setNoseCone(String noseCone) {

        rocketNoseCone = noseCone;
    }

    public String getNoseCone(){ return rocketNoseCone; }

    @Override
    public void setFrame(String frame) {

        rocketFrame = frame;
    }

    public String getRocketFrame(){ return rocketFrame; }

    @Override
    public void setFin(String fin) {

        rocketFin = fin;
    }

    public String getRocketFin(){ return rocketFin; }

}
