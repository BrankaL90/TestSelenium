package Main;

import java.util.Random;
import java.util.Scanner;

public class NumberAssignment {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int zamisljeniBroj = random.nextInt(4) ;

        System.out.println("Koji broj sam zamislio?");

        while (true) {
            System.out.print("Pogodite broj: ");
            int userGuess = scanner.nextInt();

            if (userGuess == zamisljeniBroj) {
                System.out.println("Tacno! " + zamisljeniBroj);
                break;
            } else {
                System.out.println("Nije tacno!");
            }
        }
        scanner.close();
    }
}

