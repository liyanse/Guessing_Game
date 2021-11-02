# Guessing_Game
The rule of the game is simple, the computer generates a random number and the player is supposed to guess the number in 5 trials
As the user plays, they are reminded of the remaining trials they have 
Additionally the system should give hints on whether the number guessed is higher or lower than the actual digit.
To preprare the program we start by welcoming our players to the game;

                public class Main {
                    public static void main(String[] args){
                        System.out.println("Welcome to the Guessing Game");
                        System.out.println("May I know your name");

                        Scanner scanner = new Scanner(System.in);
                        String name = scanner.next();
                        System.out.println("Hello "+ name);
                        
Afterwards, we continue to ask the user whether or not they would like to participate in the game, the game will only continue if the response is yes;

                 System.out.println("Shall we begin?");
                        System.out.println("\t1. Yes");
                        System.out.println("\t2. No");

                        int acceptResponse = scanner.nextInt();
                        while (acceptResponse!= 1){
                            System.out.println("Shall we begin?");
                            System.out.println("\t1. Yes");
                            System.out.println("\t2. No");
                            acceptResponse = scanner.nextInt()
                            
When the  user says yes, the computer goes on to generate the random number and prompts the user to enter a guess. In this section we created three variables for the program;
Trials: that counts the number of times the user guessed and goes on to obey a whil and if statement at the end of the code;
Victory: that determines whether or not the number guessed is the same as that generated 
EndGame: it instructs the program on what to do at the end of the game.

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
If the player wins, the program is supposed to generate a congratulations message otherwise, it should say Game over.  

                        if (victory){
                            System.out.println("Congratulations on your victory," + name + ",you have won in " + Trials + " trials" );
                        }else {
                            System.out.println("Game over");
                            System.out.println("The number was " + n);
                        }
