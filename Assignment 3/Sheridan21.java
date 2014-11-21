/*
Name: Michael
Assignment 3
Due Date: Nov 6 2014
Description: Simple implementation of blackjack in java, BONUS IS IMPLEMENTED
*/


import java.util.Random;
import java.util.Scanner;

public class Sheridan21 {

    public static void main(String[] args) {
        boolean playAgain = true;
        while (playAgain == true) {

            String answer = "";
            int playerHand = 0;
            int dealerHand = 0;
            boolean anotherCard = true;
            boolean playerBust = false;
            boolean dealerBust = false;


            playerHand = drawCard("Player", playerHand);
            dealerHand = drawCard("Dealer", dealerHand);
            playerHand = drawCard("Player", playerHand);

            System.out.println("Player Total is " + playerHand);

            while (anotherCard == true) {
                System.out.println("would you like another card? (yes/no)");
                Scanner input = new Scanner(System.in);
                answer = input.nextLine();
                if (answer.equals("yes")) {
                    playerHand = drawCard("Player", playerHand);
                    System.out.println("Player Total is " + playerHand);
                    if (playerHand > 21) {
                        playerBust = true;
                        break;
                    }
                } else {
                    anotherCard = false;

                }


            }
            if (playerBust == false) {
                while (dealerHand < 17) {
                    dealerHand = drawCard("Dealer", dealerHand);
                    System.out.println("Dealer Total is " + dealerHand);
                    if (dealerHand > 21){
                        dealerBust = true;
                        
                    }

                }
            }
            whoWins(playerHand, dealerHand, playerBust, dealerBust);

            answer = "";
            playerHand = 0;
            dealerHand = 0;
            anotherCard = true;
            playerBust = false;
            dealerBust = false;

            playAgain = playAgain();
        }

    }


    static public int drawCard(String a, int hand) {
        Random rand = new Random();
        int temp = rand.nextInt(10);
        if (temp == 0) {
            temp++;
        }
        System.out.println(a + " draws " + temp);
        temp += hand;
        return temp;
    }

    static public void whoWins(int playerHand, int dealerHand, boolean playerBust, boolean dealerBust) {
        if (playerBust == true) {
            System.out.println("Sorry you busted. Dealer Wins!");
        } else if (dealerBust == true) {
            System.out.println("Player Wins!");
        } else if (playerHand == dealerHand) {
            System.out.println("Player Push");
        } else if (playerHand > dealerHand) {
            System.out.println("Player Wins!");

        } else if (playerHand < dealerHand) {
            System.out.println("Dealer Wins!");

        }
    }
    static public boolean playAgain(){
        String answer = "";
        System.out.println("Would you like to play again? (yes/no)");
        Scanner input = new Scanner(System.in);
        answer = input.nextLine();
        if (answer.equals("yes")){
            return true;
        }
        else{
            System.out.println("Thanks for playing!");
            return false;

        }

    }

}
