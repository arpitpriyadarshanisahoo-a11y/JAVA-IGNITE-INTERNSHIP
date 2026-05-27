package DAY2;
import java.util.Scanner;
public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter a decimal number:");
        double num = sc.nextDouble();

        int whole = (int) num;

        System.out.println("Whole number is: " + whole);
        sc.close();
    }

}
