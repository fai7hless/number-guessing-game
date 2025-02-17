import java.util.Scanner;

class NumberGuessingGame{
    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I'm thinking of a number between 1 and 100.");
            System.out.println("Please select the difficulty level:");
            System.out.println(
                "1. Easy (10 chances)\n" + 
                "2. Medium (5 chances)\n" + 
                "3. Hard (3 chances)");
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
                    break;
                } else if (guess < number) {
                    System.out.println("The number is greater than your guess.");
                } else {
                    System.out.println("The number is less than your guess.");
                }
                chances--;
            }
        }
    }
}