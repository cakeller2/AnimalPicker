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

            boolean correct = false;
            //loops until user enters something valid
            while (correct == false) {
                System.out.println("That is an invalid input, try again and enter \"d\" for dog or \"c\" for cat");
                //user picks animal
                animal = input.nextLine();
                if (animal.equalsIgnoreCase("d")) {
                    System.out.println("Beautiful dog ASCII art goes here");
                    correct = true;
                } else if (animal.equalsIgnoreCase("c")){
                    System.out.println("Beautiful cat ASCII art goes here");
                    correct = true;
                }
            }

        }
    } 
}

/*If the user enters in an invalid input, make the program continually ask the user to enter in a
valid option until they do so*/