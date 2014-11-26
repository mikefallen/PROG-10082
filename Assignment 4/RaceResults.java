import java.util.Scanner;

/**
 * Created by mike on 11/21/2014.
 */
public class RaceResults {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many runners are in the race? ");
        int numRunners = input.nextInt();
        String winner = "";
        double avg = 0;
        double bestTime = Double.POSITIVE_INFINITY;

        Runner[] runArray = new Runner[numRunners];

        for(int i = 0; i < runArray.length; i++){
            input = new Scanner(System.in);
            System.out.print("Enter name of runner " + i + ": ");
            String name = input.nextLine();
            System.out.print("Enter country of runner " + i + ": ");
            String country = input.nextLine();
            System.out.print("Enter time of runner " + i + ": ");
            double time = input.nextDouble();

            runArray[i] = new Runner(name, country, time);
        }

        for(int i = 0; i < runArray.length; i++) {
            if (runArray[i].getTime()< bestTime){
                bestTime = runArray[i].getTime();
                winner = runArray[i].getName();

            }
            avg += runArray[i].getTime();



        }
        System.out.println("Athlete             Country         Result");
        System.out.println("=======             =======         ======");
        for(int i = 0; i < runArray.length; i++) {
            //System.out.printf("%0s %20s %44s",runArray[i].getName(), runArray[i].getCountry(), runArray[i].getTime());
            System.out.format("%-20s%-12s%10.2f \n",runArray[i].getName(), runArray[i].getCountry(),runArray[i].getTime());



        }
        System.out.println(winner + " is the winner ");
        System.out.printf("There were " + runArray.length + " racers and the avg finish time was " + avg/runArray.length+"s");

    }
}
