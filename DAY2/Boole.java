package DAY2;
import java.util.Scanner;
public class Boole {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = sc.nextLine();

        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Are you a student (true/false)");
        boolean isStudent = sc.nextBoolean();

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Student Status : " + isStudent);

        sc.close();
    }

}
