import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        //Declarations
        Scanner in = new Scanner(System.in);

        String playerA = "";
        String playerB = "";

        //User Prompt A
        System.out.print("Player A please enter a move: ");

        //User Input and Verification A
        if (in.hasNext()) {
            playerA = in.next();
            if (!(playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P" ) || playerA.equalsIgnoreCase("S"))) {
                System.out.println("Not a valid input, please re-run the program to try again.");
                System.exit(0);
            }
            } else {
            System.out.println("Not a valid input, please re-run the program to try again.");
            System.exit(0);
        }

        //User Prompt B
        System.out.print("Player B please enter a move: ");

        //User Input and Verification B
        if (in.hasNext()) {
            playerB = in.next();
            if (!(playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P" ) || playerB.equalsIgnoreCase("S"))) {
                System.out.println("Not a valid input, please re-run the program to try again.");
                System.exit(0);
            }
        } else {
            System.out.println("Not a valid input, please re-run the program to try again.");
            System.exit(0);
        }

        //Outcome Logic Calculations
                if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers Rock, Player B wins!");
                } else if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("S")) {
                    System.out.println("Rock breaks Scissors, Player A wins!");
                } else if (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock, Player A wins!");
                } else if (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("S")) {
                    System.out.println("Scissors cut Paper, Player B wins!");
                } else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks Scissors, Player B wins!");
                } else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cut Paper, Player A wins!");
                } else if (playerA.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs. Rock, it's a tie!");
                } else if (playerA.equalsIgnoreCase("P")) {
                    System.out.println("Paper vs. Paper, it's a tie!");
                } else {
                    System.out.println("Scissors vs. Scissors, it's a tie!");
                }
    }
}
