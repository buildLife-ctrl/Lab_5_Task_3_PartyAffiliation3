import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variable
        String userPartyAffiliation;

        //asks the user the party they are associated with
        System.out.println("What is the party you are associated with? Please type in D for democrat, R for republican, I for independent and other.");
        userPartyAffiliation = scan.nextLine();

        if (userPartyAffiliation.equalsIgnoreCase("D")) {
            System.out.println("You are a Democratic Donkey!");
        } else if (userPartyAffiliation.equalsIgnoreCase("R")) {
            System.out.println("You are a Republican Elephant!");
        } else if (userPartyAffiliation.equalsIgnoreCase("I")) {
            System.out.println("You are an Independent person.");
        } else if (userPartyAffiliation.equalsIgnoreCase("other")) {
            System.out.println("You are not associated with any of the above.");
        } else {
            System.out.println("You did not type a valid input or you misspelled.");
            System.exit(0);
        }
    }
}