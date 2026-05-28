package DAY3ASSIGNMENT;
import java.util.Scanner;
public class SmartLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        String correctUsername = "arpita";
        String correctPassword = "arpita@123";

        int attempts = 0;
        boolean loginSuccess = false;

        while (attempts < 3) {

            System.out.print("Enter Username: ");
            String username = sc.next();

            System.out.print("Enter Password: ");
            String password = sc.next();

            if (username.equals(correctUsername) &&
                    password.equals(correctPassword)) {

                loginSuccess = true;
                break;

            } else {

                if (username.equals(correctUsername)
                        && password.startsWith("Java")
                        && password.endsWith("123")) {

                    System.out.println("Almost correct password");

                } else {
                    System.out.println("Invalid Username or Password");
                }

                attempts++;
            }
        }

        if (loginSuccess) {

            System.out.print("Enter OTP: ");
            int otp = sc.nextInt();

            if (otp >= 1000 && otp <= 9999) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Invalid OTP");
            }

        } else {
            System.out.println("Account Blocked");
        }

        sc.close();
	}

}
