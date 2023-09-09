import java.util.*;

public class NumberGuessing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber = 0;
        int number = (int) (Math.random() * 100);

        do {
            System.out.println("Guess the Number(1-100):");
            myNumber = sc.nextInt();

            if (myNumber == number) {
                System.out.println("WooHoo ..  You won the Game ...");
                break;
            } else if (myNumber > number) {
                System.out.println("You entered a too large Number...");
            } else {
                System.out.println("You entered a too small number...");
            }
        } while (myNumber >= 0);
    }
}