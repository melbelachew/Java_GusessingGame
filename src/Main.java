import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Random r = new Random();
        int myNum = 1 + r.nextInt(10);

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Guess what number I am thinking of between 1 & 10?");

        int userGuess = keyboard.nextInt();

        while (userGuess != myNum){
            System.out.println("hmmm....try again!");
            userGuess = keyboard.nextInt();
        }
        System.out.println("You guessed right!");
        }
    }

