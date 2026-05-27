package DAY2ASSIGNMENT;
import java.util.Scanner;

public class ATMInformationSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter Withdrawal Amount: ");
        double withdrawal = sc.nextDouble();

        if (balance > withdrawal) {
            double remainingBalance = balance - withdrawal;

            System.out.println("\n----- ATM DETAILS -----");
            System.out.println("Account Holder: " + name);
            System.out.println("Remaining Balance: " + remainingBalance);
        } else {
            System.out.println("\nInsufficient Balance!");
        }

        sc.close();
    }
}
