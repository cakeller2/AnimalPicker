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
            System.out.println("Beautiful dog ASCII art goes here");
        } else if (animal.equalsIgnoreCase("c")){
            System.out.println("Beautiful cat ASCII art goes here");
        }
    } 
}

/*Ask the user which animal they would like to see: a dog or a cat. Include if statements based on
which option they chose, and print out to the user placeholder text. For example, if the user
chose “cat”, you would print out something along the lines of “CAT ASCII ART HERE”.*/