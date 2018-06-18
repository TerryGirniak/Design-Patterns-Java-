public class BuilderTest {

    public static void main(String[] args){

        RocketBuilder averageRocketBuilder = new AverageRocketBuilder();
        Director director = new Director(averageRocketBuilder);

        director.buildRocket();
        Rocket mark1 = director.getRocket();

        // Complete rocket output:
        System.out.println("Average rocket: \n");

        System.out.println("Rocket's nose cone: " + mark1.getNoseCone());
        System.out.println("Rocket's frame cone: " + mark1.getRocketFrame());
        System.out.println("Rocket's fin: " + mark1.getRocketFin());

        System.out.println(mark1.getRocketBlueprint());

    }
}
