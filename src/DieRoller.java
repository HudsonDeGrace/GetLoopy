import java.util.Random;
import java.util.Scanner;
public class DieRoller {
    public static void main(String[] args) {
        Random gen = new Random();
        Scanner in = new Scanner(System.in);

        int roll = 1;
        int die1;
        int die2;
        int die3;

        boolean done = false; // Ends the checking input do while loop
        boolean terminate = false; // Ends the program

        do {
            die1 = gen.nextInt(6) + 1;
            die2 = gen.nextInt(6) + 1;
            die3 = gen.nextInt(6) + 1;
            int sum = die1 + die2 + die3;
            System.out.println("Roll    Die1    Die2    Die3    Sum");
            System.out.println("-----------------------------------");
            System.out.printf("  %1d     %2d     %3d    %4d    %5d%n", roll, die1, die2, die3, sum);
            roll++;

            if(die1 == die2 && die1 == die3){
                terminate = true;
            }

            do {
                System.out.print("Do you want to continue? [y or n] ");
                if (in.hasNextLine()) {
                    String yesOrNo = in.nextLine();
                    if (yesOrNo.equals("n")) {
                        done = true;
                        terminate = true;
                    } else if(yesOrNo.equals("y")){
                        System.out.println();
                        done = true;
                    }else{
                        System.out.println("\nYou said your answer is: " + yesOrNo);
                        System.out.println("You have to enter y or n!");
                    }
                }
            }while(!done);
        } while (!terminate);

    }
}
