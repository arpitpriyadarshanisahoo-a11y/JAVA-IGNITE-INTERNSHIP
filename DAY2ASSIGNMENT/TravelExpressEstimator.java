package DAY2ASSIGNMENT;
import java.util.Scanner;
public class TravelExpressEstimator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Travel Distance (KM): ");
        double distance = sc.nextDouble();

        System.out.print("Enter Petrol Price per Liter: ");
        double petrolPrice = sc.nextDouble();

        System.out.print("Enter Vehicle Mileage (KM/L): ");
        double mileage = sc.nextDouble();

        double petrolNeeded = distance / mileage;
        double totalCost = petrolNeeded * petrolPrice;

        
        System.out.println("\n----- TRAVEL EXPENSE -----");
        System.out.println("Petrol Needed: " + petrolNeeded + " liters");
        System.out.println("Total Travel Cost: " + totalCost);

        sc.close();	
	}

}
