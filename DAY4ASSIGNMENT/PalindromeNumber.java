package DAY4ASSIGNMENT;
import java.util.Scanner;
public class PalindromeNumber {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, rem, reverse = 0, original;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        original = num;
        while(num > 0) {
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }

        if(original == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
            sc.close();
        }
    }

}
