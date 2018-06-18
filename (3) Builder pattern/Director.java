public class Director {

    private RocketBuilder rocketBuilder;

    Director(RocketBuilder rocketBuilder){

        this.rocketBuilder = rocketBuilder;
    }

    public Rocket getRocket(){

        return rocketBuilder.getRocket();
    }

    public void buildRocket(){

        this.rocketBuilder.buildRocketNoseCone();
        this.rocketBuilder.buildRocketFrame();
        this.rocketBuilder.buildRocketFin();
        this.rocketBuilder.buildRocketBlueprint();
    }
}
