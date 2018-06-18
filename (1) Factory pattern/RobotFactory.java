public class RobotFactory {

    public Robots createRobot(String robot){

        Robots newRobot = null;

        if(robot.equals("U28")){
            return new U28();

        } else if(robot.equals("QZ13")){
            return new QZ13();

        } else if(robot.equals("Omega9")){
            return new Omega9();

        } else if(robot.equals("Omega2")){
            return new Omega2();

        } else return null;

    }
}
