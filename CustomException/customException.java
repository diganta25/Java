package CustomException;

import java.util.Scanner;

public class customException {
    public customException(String message) {
    }

    public static void main(String[] args) {

        // exception - an event, after execution, that disrupts the normal flow of the
        // program
        // e.g. ArithmeticException, ArrayIndexOutOfBoundsException,
        // FileNotFoundException

        // user defined exceptions - custom exceptions
        // e.g. - DuplicateEmail, InvaildCreditException, AgeException

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println("A problem occured: " + e);
        }

    }

    static void checkAge(int age) throws AgeException {

        if (age < 18) {
            throw new AgeException("\n" + "You must be 18+ to sign up");
        } else {
            System.out.println("You are now signed up!");
        }
    }

}
