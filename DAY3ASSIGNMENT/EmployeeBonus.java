package DAY3ASSIGNMENT;
import java.util.Scanner;
public class EmployeeBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("===== Employee Bonus Eligibility Checker =====");

        System.out.print("Enter years of experience: ");
        int years = sc.nextInt();

        System.out.print("Enter attendance percentage: ");
        double attendance = sc.nextDouble();

        System.out.print("Enter performance rating (1-5): ");
        int rating = sc.nextInt();

        if (attendance < 60) {

            System.out.println("Not Eligible");
            System.out.println("Bonus Rejected Due To Low Attendance");

        } else if (years > 3 && attendance > 85) {

            int bonus = 0;

            if (rating == 5) {
                bonus = 50000;
            } else if (rating == 4) {
                bonus = 30000;
            } else if (rating == 3) {
                bonus = 10000;
            }

            if (bonus > 0) {
                System.out.println("Eligible");
                System.out.println("Bonus Amount = ₹" + bonus);
            } else {
                System.out.println("No Bonus");
            }

        } else {
            System.out.println("Not Eligible");
        }

        sc.close();
    }
}
