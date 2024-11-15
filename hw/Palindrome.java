package hw;
import java.util.Scanner;


public class Palindrome {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int input = myObj.nextInt();
		int output = 0;

        for (int i = input; i > 0; i /= 10) {
            int rem = i % 10;  
            output = output * 10 + rem;
        }

        if (input == output) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is not a Palindrome.");
        }

	}

}