package DAY3ASSIGNMENT;
import java.util.Scanner;
public class ElectrickBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        double bill = 0;

        System.out.println("===== Electricity Bill Generator =====");

        System.out.println("1. Domestic");
        System.out.println("2. Commercial");
        System.out.println("3. Industrial");

        System.out.print("Enter Connection Type: ");
        int type = sc.nextInt();

        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();

        switch (type) {

            case 1:

                if (units <= 100) {
                    bill = 0;
                } else if (units <= 300) {
                    bill = (units - 100) * 5;
                } else {
                    bill = (200 * 5) + ((units - 300) * 8);
                }

                System.out.println("Domestic Bill = ₹" + bill);
                break;

            case 2:

                if (units < 200) {
                    bill = units * 10;
                } else {
                    bill = units * 15;
                }

                System.out.println("Commercial Bill = ₹" + bill);
                break;

            case 3:

                System.out.print("Is Power Factor Good? (true/false): ");
                boolean powerFactor = sc.nextBoolean();

                bill = units * 20;

                if (units > 500 && powerFactor) {
                    bill = bill - (bill * 0.10);
                }

                System.out.println("Industrial Bill = ₹" + bill);
                break;

            default:
                System.out.println("Invalid Connection Type");
        }

        sc.close();

	}

}
