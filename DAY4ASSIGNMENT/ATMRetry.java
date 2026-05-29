package DAY4ASSIGNMENT;
import java.util.Scanner;
public class ATMRetry {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int pin;
	        int correctPin = 1234;

	        do {
	            System.out.print("Enter ATM PIN: ");
	            pin = sc.nextInt();

	            if(pin != correctPin) {
	                System.out.println("Wrong PIN! Try Again.");
	            }

	        } while(pin != correctPin);

	        System.out.println("PIN Accepted");
	        sc.close();
	 }

}
