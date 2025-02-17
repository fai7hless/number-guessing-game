import java.util.Scanner;

class NumberGuessingGame{
    public static void main(String[] args) {
        int fewestAttemptsEasy = 0;
        int fewestAttemptsMedium = 0;
        int fewestAttemptsHard = 0;
        while (true) {
            int attempts = 0;
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I'm thinking of a number between 1 and 100.");
            System.out.println("Please select:");
            System.out.println(
                "1. Easy (10 chances)\n" + 
                "2. Medium (5 chances)\n" + 
                "3. Hard (3 chances)\n" +
                "4. High Scores\n" +
                "5. Exit");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            sc.nextLine();
            int chances = 0;
            switch (choice) {
                case 1:
                    chances = 10;
                    break;
                case 2:
                    chances = 5;
                    break;
                case 3:
                    chances = 3;
                    break;
                case 4:
                    System.out.println("Fewest attempts in Easy mode: " + fewestAttemptsEasy);
                    System.out.println("Fewest attempts in Medium mode: " + fewestAttemptsMedium);
                    System.out.println("Fewest attempts in Hard mode: " + fewestAttemptsHard);
                    continue;
                case 5:
                    System.out.println("Thank you for playing the Number Guessing Game!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            int number = (int) (Math.random() * 100) + 1;

            while(chances > 0){
                System.out.println("You have " + chances + " chances left.");
                System.out.println("Enter your guess:");
                int guess = sc.nextInt();
                sc.nextLine();
                if (guess == number) {
                    System.out.println("Congratulations! You guessed the number correctly.");
                    attempts++;
                    break;
                } else if (guess < number) {
                    System.out.println("The number is greater than your guess.");
                    attempts++;
                } else {
                    System.out.println("The number is less than your guess.");
                    attempts++;
                }
                chances--;
            }
            if (chances == 0) {
                System.out.println("You have exhausted all your chances.");
                System.out.println("The number was: " + number); 
                
            }

            if (choice == 1) {
                if (fewestAttemptsEasy == 0 || attempts < fewestAttemptsEasy) {
                    fewestAttemptsEasy = attempts;
                }
            } 
            else if (choice == 2) {
                if (fewestAttemptsMedium == 0 || attempts < fewestAttemptsMedium) {
                    fewestAttemptsMedium = attempts;
                }
            } 
            else {
                if (fewestAttemptsHard == 0 || attempts < fewestAttemptsHard) {
                    fewestAttemptsHard = attempts;
                }
            }
        }
    }
}