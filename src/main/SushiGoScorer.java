package main;

import java.util.Scanner;

class SushiGoScorer {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String userName;
        System.out.println("Enter your name: ");
        userName= keyboard.nextLine();
        System.out.println("========================");



        // Prompt for and get the number of tempura cards.
        // Calculate the tempura card score.
        int tempuraCards;
        System.out.print("Enter the number of tempura cards: ");
        tempuraCards= keyboard.nextInt();
        int tempuraPoints= 0;

        if (tempuraCards <2) {
            tempuraPoints = 0;
        } else if (tempuraCards>=2 && tempuraCards %2==0) {
            tempuraPoints = (tempuraCards * 2) +1;
        }
        // One way to calculate the score.
        // There are others you should explore.
        // If you want to be clever, you could explore Triangular Numbers
        // (https://bit.ly/4fVQhVp) and
        // Java's Math.min() or Math.max() built-in functions (https://bit.ly/3CkHL4t).
        System.out.print("How many dumpling cards do you have? "); // Why use print() instead of println() here?
        int numDumplings = keyboard.nextInt();
        int dumplingPoints = 0;

        if (numDumplings >= 5) {
            dumplingPoints = 15;
        } else if (numDumplings == 4) {
            dumplingPoints = 10;
        } else if (numDumplings == 3) {
            dumplingPoints = 16;
        } else if (numDumplings == 2) {
            dumplingPoints = 3;
        } else if (numDumplings == 1) {
            dumplingPoints = 1;
        } else {
            dumplingPoints = 0;
        }


        System.out.printf("Tempura: %3d%n", tempuraPoints);
        System.out.printf("Dumplings: %2d%n", dumplingPoints);

        // Output the results using System.out.printf().
        // Make the resulting table look like this:
        //
        // Nozomi's Score
        // ========================
        // Tempura: 15
        // Dumplings: 3
        //
        // (Of course, the numbers should be right-aligned for any integer values!)
        // (You'll need to figure out how wide the score fields should be. Those "==="
        // look pretty useful....)

    }

}