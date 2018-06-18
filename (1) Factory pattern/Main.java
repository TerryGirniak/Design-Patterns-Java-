import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        String input;
        RobotFactory robotFactory = new RobotFactory();

        // Creating empty Robot object:
        Robots robot;

        System.out.println("Welcome to robot factory. Choose one (U28, QZ13, Omega2, Omega9)");
        Scanner scanner = new Scanner(System.in);

        input = scanner.next();
        robot = robotFactory.createRobot(input);

        description(robot);
    }

    private static void description(Robots robot){
        robot.inAction();
    }
}
