public class Hammer implements UsingHammer{

    @Override
    public void smash() {
        System.out.println("Smashing wall with a hammer:\n");

        System.out.println(
                "      /(  ___________\n" +
                "     |  >:===========`\n" +
                "      )(\n" +
                "  (((    )))\n" +
                "-------------------\n" +
                "-------------------\n");
    }

    @Override
    public void hit() {
        System.out.println("Hitting with a hammer: \n");

        System.out.println(
                "      /(  ___________\n" +
                "     |  >:===========`\n" +
                "      )(\n");
    }
}
