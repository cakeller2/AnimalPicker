import java.util.Scanner;

public class AnimalPicker {
    public static void main (String[] arg) {
        Scanner input = new Scanner(System.in); //sets up scanner

        //Beginning print statments
        System.out.println("\nHello! Would you like to see the ASCII art of a dog or cat?");
        System.out.println("Please enter \"d\" for dog or \"c\" for cat");

        //user picks animal
        String animal = input.nextLine();

        //if statement for user animal choice
        if (animal.equalsIgnoreCase("d")) {
            printArt("d");
        } else if (animal.equalsIgnoreCase("c")){
            printArt("c");
        } else { //catches an invalid input

            boolean correct = false;
            //loops until user enters something valid
            while (correct == false) {
                System.out.println("That is an invalid input, try again and enter \"d\" for dog or \"c\" for cat");
                //user picks animal
                animal = input.nextLine();
                if (animal.equalsIgnoreCase("d")) {
                    printArt("d");
                    correct = true;
                } else if (animal.equalsIgnoreCase("c")){
                    printArt("c");
                    correct = true;
                }
            }

        }
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
        }
    }
}

/*Fill in the placeholder ASCII Art printlns with actual ASCII art. You can find ASCII art for dogs
here. You can find ASCII art for cats here. To easily make the ASCII art format properly in a
println statement, you can use this website I made here.*/