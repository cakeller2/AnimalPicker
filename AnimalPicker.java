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
        } else { //catches an invalid input
            System.out.println("That is an invalid input, goodbye!");
        }
    } 
}

/*Make the program print an error message out if the user inputs an invalid option.*/