package DAY5ASSIGNMENT;
import java.util.Scanner;
public class ShoppingDiscountSystem {
	public static double calculateDiscount(double billAmount, double discountPercent) {
        double discount = (billAmount * discountPercent) / 100;
        return billAmount - discount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bill Amount: ");
        double bill = sc.nextDouble();

        System.out.print("Enter Discount Percentage: ");
        double discount = sc.nextDouble();

        double finalBill = calculateDiscount(bill, discount);

        System.out.println("Final Bill: " + finalBill);
        sc.close();
    }
	

}
