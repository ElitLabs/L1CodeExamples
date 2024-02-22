import java.util.Scanner; //Importing a library. This is code that has been made for you already

/*
 * We will learn how to do this in lesson 2!
 * No need to talk about this in depth for now
 */

public class Example6 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int number = reader.nextInt(); // An integer is a number without decimal places that can be positive, negative, or zero
        int doubleNumber = number * 2;
        System.out.println("Twice your number is " + doubleNumber);
        reader.close();
    }
}