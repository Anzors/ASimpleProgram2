package helloWorld;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Create a random number generator
        Random rnd = new Random();

        //Get a random number between 0 and 99
        int number = rnd.nextInt(100);
        int guess = -1;

        //Create a scanner to read from the console
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number between 0 and 99 : ");
            System.out.println("Hint - " + number);
            guess = sc.nextInt();

            if (guess < number)
            {
                System.out.println("Number is too low");
            }
            else if (guess > number)
            {
                System.out.println("Number is too high");
            }
            else if (number != guess) {
                System.out.println("Congratulations");
                break; // This will make the loop stop when the
                //player gets the answer correct and therefore the program will end
            }
            else
            {
                System.out.println("Not a valid option ");
            }
        }
    }
}