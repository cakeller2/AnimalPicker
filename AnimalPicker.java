import java.util.Scanner;

public class AnimalPicker {
    public static void main (String[] arg) {
        Scanner input = new Scanner(System.in); //sets up scanner

        //Beginning print statments
        System.out.println("\nHello! Would you like to see the ASCII art of a dog or cat?");
        System.out.println("Please enter \"d\" for dog, \"c\" for cat, or \"f\" for fish");

        //user picks animal
        String animal = input.nextLine();

        //if statement for user animal choice
        if (animal.equalsIgnoreCase("d")) {
            printArt("d");
        } else if (animal.equalsIgnoreCase("c")){
            printArt("c");
        } else if (animal.equalsIgnoreCase("f")) {
            printArt("f");
        }else { //catches an invalid input

            boolean correct = false;
            //loops until user enters something valid
            while (correct == false) {
                System.out.println("That is an invalid input, try again and enter \"d\" for dog, \"c\" for cat, or \"f\" for fish");
                //user picks animal
                animal = input.nextLine();
                if (animal.equalsIgnoreCase("d")) {
                    printArt("d");
                    correct = true;
                } else if (animal.equalsIgnoreCase("c")){
                    printArt("c");
                    correct = true;
                } else if (animal.equalsIgnoreCase("f")) {
                    printArt("f");
                    correct = true;
                }
            }

        }
        input.close();
    } 

    public static void printArt(String userPick){
        if (userPick.equalsIgnoreCase("c")){ //cat ascii
            System.out.println(" ,_     _\n" + 
                                " |\\\\_,-~/\n" + 
                                " / _  _ |    ,--.\n" + 
                                "(  @  @ )   / ,-\'\n" +
                                " \\  _T_/-._( (\n" +
                                " /         `. \\\n" + 
                                "|         _  \\ |\n" +
                                " \\ \\ ,  /      |\n" +
                                "  || |-_\\__   /\n" +
                                " ((_/`(____,-\'");
        } else if (userPick.equalsIgnoreCase("d")) { //dog ascii
            System.out.println("    ___\n" +
                                " __/_  `.  .-\"\"\"-.\n" +
                                " \\_,` | \\-\'  /   )`-\')\n" +
                                "  \"\") `\"`    \\  ((`\"`\n" +
                                " ___Y  ,    .\'7 /|\n" +
                                "(_,___/...-` (_/_/");
        } else if (userPick.equalsIgnoreCase("f")) {
            System.out.println("     /`-._\n" +
                                "    /_,.._`:-\n" + 
                                " ,.-\'   ,   `-:..-\')\n" + 
                                ": o ):\';      _  {\n" + 
                                " `-._ `\'__,.-\' \\`-.)\n" +
                                "     `\\\\  \\,.-\'`");
        }
    }
}

/*Add an option for fish. You can find ASCII art for fish here*/