public class Axe implements UsingAxe{

    @Override
    public void chop() {
        System.out.println("Chopping with an axe:");
        System.out.println("  _,-,\n" +
                "<|_  |\n" +
                " ||`-'\n" +
                " ||\n" +
                " ||\n" +
                " ||\n");
    }

    @Override
    public void cut() {
        System.out.println("Cutting tree with an axe:\n");

        System.out.println(
                "  ooxoxo oo  oxoxooo\n" +
                " oooo xxoxoo ooo ooox\n" +
                " oxo o oxoxo  xoxxoxo\n" +
                "  oxo xooxoooo o ooo\n" +
                "    ooo\\oo\\  /o/o\n" +
                "        \\  \\/ /\n" +
                "         |   /\n" +
                "     <N) |  |\n" +
                "      |  | D|\n" +
                "      |  |  |\n" +
                "         |  |\n" +
                "  ______/____\\____");
    }
}
