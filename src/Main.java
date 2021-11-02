import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to the Guessing Game");
        System.out.println("May I know your name");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello "+ name);

        System.out.println("Shall we begin?");
        System.out.println("\t1. Yes");
        System.out.println("\t2. No");

        int acceptResponse = scanner.nextInt();
        while (acceptResponse!= 1){
            System.out.println("Shall we begin?");
            System.out.println("\t1. Yes");
            System.out.println("\t2. No");
            acceptResponse = scanner.nextInt();
        }
        Random random = new Random();
        int n =random.nextInt(30) + 1;
        System.out.println("Please enter your guess: ");
        int guess = scanner.nextInt();

        int Trials = 0;
        boolean victory = false;
        boolean endGame = false;

        while (!endGame){
            Trials++;


            if (Trials < 5){
                if (guess == n){
                    victory = true;
                    endGame = true;
                }else if (guess > n){
                    System.out.println("Guess is lower than your input");
                    guess =scanner.nextInt();
                }else {
                    System.out.println("Guess is higher than your input");
                    guess = scanner.nextInt();
                }
        }else {
                endGame =true;
            }

    }
        if (victory){
            System.out.println("Congratulations on your victory," + name + ",you have won in " + Trials + " trials" );
        }else {
            System.out.println("Game over");
            System.out.println("The number was " + n);
        }
}
}
