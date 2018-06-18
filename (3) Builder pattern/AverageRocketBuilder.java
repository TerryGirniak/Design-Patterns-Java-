public class AverageRocketBuilder implements RocketBuilder {

    private Rocket rocket;

    AverageRocketBuilder(){

        this.rocket = new Rocket();
    }

    @Override
    public void buildRocketNoseCone() {
        this.rocket.setNoseCone("Carbon fiber nose cone");
    }

    @Override
    public void buildRocketFrame() {
        this.rocket.setFrame("Titanium frame");
    }

    @Override
    public void buildRocketFin() {
        this.rocket.setFin("Standard fins");
    }

    @Override
    public void buildRocketBlueprint() {

        rocket.setBlueprint("\n /\\ \n" +
                              " ||\n" +
                              " ||\n" +
                              "/  \\");
    }


    @Override
    public Rocket getRocket(){
        return this.rocket;
    }
}
