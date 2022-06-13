package Practice_Java_DSA.CoreJava;
import java.util.Scanner;

class Input {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
    	
        System.out.print("Enter first integer: ");
        double number1 = input.nextDouble();
        System.out.print("Enter second integer: ");
        double number2 = input.nextDouble();
        System.out.println("You entered " + number1+" "+number2);
        double sum = number1+number2;
        System.out.println("Sum of " + number1+" and "+number2+ " is " + sum);
        // closing the scanner object
        input.close();
    }
}
