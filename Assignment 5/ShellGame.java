/*
MICHAEL
2014/12/4
Assignment 5
ShellGame that allows for three command-line arguments when run 1: player name 2: number of shells 3: number of guesses
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String playerName = args[0];
        int numShells = Integer.parseInt(args[1]);
        int numGuess = Integer.parseInt(args[2]);

        int r = (int) (Math.random() * numShells + 1);

        System.out.println("Welcome to the shell game " + playerName);

        boolean[] shells = new boolean[numShells];
        shells[r-1] = true;

        System.out.println("DEBUG " + shells.length);
        System.out.println("DEBUG " + r);

        for (int i = 0;i < numGuess;i++) {
            try {
                System.out.println("Enter Your Guess");
                Scanner input = new Scanner(System.in);
                int guess = input.nextInt() - 1;

                if (shells[guess] == true) {
                    System.out.println("Congrations You Won!");
                    System.exit(0);
                }
                else {
                    System.out.println("Incorrect!");
                }
            }
            catch(InputMismatchException a){
                System.out.println("Input was non-integer DISQUALIFIED!");
                System.exit(0);
            }
            catch(ArrayIndexOutOfBoundsException a){
                System.out.println("Guess was out of bounds DISQUALIFIED!");
                System.exit(0);

            }


        }
        System.out.println("YOU LOSE! Shell # " + r + " contained the ball");


    }
}
