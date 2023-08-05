// a game between you and computer ....lets play a series of 5 matches

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        rule();         // method call for rule of the game
        match();        // all matches are here

    }

    //rules of the game
    public static void rule() {
        System.out.println("Three thing are there :--- Rock , Paper and Scissor");
        System.out.println("you and computer both will select one among the three ");
        System.out.println("if both having same thing. the match is drawn otherwie decision willl be taken under following condiition");
        System.out.println("1...   Scissor cut the paper");
        System.out.println("2...   rock beats Scissor");
        System.out.println("3...   paper beat rock");
    }

    // start the match
    public static void match() {
        System.out.println("\nlets start the game\n");
        System.out.println("press 1 for Rock , 2 for Paper and 3 for Scissor");
        Scanner kbd = new Scanner(System.in);
        Random rn = new Random();


        //decide who win
        byte match = 0;
        byte win = 0;
        byte loss = 0;
        while (match <= 5) {
            int comChoice = rn.nextInt(1, 4);        //store computer choice

            int yrchoice = kbd.nextInt();                       //store your choice

            //your turn
            switch (yrchoice) {


                case 1: {
                    System.out.println("you have choosen for Rock now its computer turn..");
                    break;


                }
                case 2: {
                    System.out.println("you have choosen for paper now its computer turn..");
                    break;

                }
                case 3: {
                    System.out.println("you have choosen for Scissors now its computer turn..");


                }
            }


            //computer turn
            if (comChoice == 1) {
                System.out.println("computer selected for Rock..");

            } else if (comChoice == 2) {

                System.out.println("computer selected for paper..");

            } else {

                System.out.println("computer selected for Scissor..");

            }


            if (yrchoice == comChoice) {
                System.out.println("match tied");
                match++;
            } else if ((yrchoice == 1 && comChoice == 2) || (yrchoice == 2 && comChoice == 3) || (yrchoice == 3 && comChoice == 1)) {

                System.out.println("computer won");
                match++;
                loss++;
            } else {

                System.out.println("you win..");
                win++;
                match++;

            }
            System.out.println("score is " + win + "-" + loss);
            if (match == 5) {
                System.out.println("all matches over");
                break;
            }
            System.out.println("press 1 for Rock , 2 for Paper and 3 for Scissor");
        }

        //deciion
        if (win == loss) {

            System.out.println("series is drawn by " + win + "-" + loss);
        } else if (win > loss) {
            System.out.println("you won the series  by " + win + "-" + loss);
        } else {
            System.out.println("you lose the series  by " + win + "-" + loss);
        }
    }
}
