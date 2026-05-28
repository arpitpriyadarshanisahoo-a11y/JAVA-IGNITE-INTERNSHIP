package DAY3ASSIGNMENT;
import java.util.Scanner;
public class CollegeAdmission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.println("===== College Admission Predictor =====");

	        System.out.print("Enter Maths Marks: ");
	        int maths = sc.nextInt();

	        System.out.print("Enter Physics Marks: ");
	        int physics = sc.nextInt();

	        System.out.print("Enter Chemistry Marks: ");
	        int chemistry = sc.nextInt();

	        double average = (maths + physics + chemistry) / 3.0;

	        if (maths < 35 || physics < 35 || chemistry < 35) {

	            System.out.println("Admission Rejected");

	        } else if ((maths >= 70 && physics >= 60 && chemistry >= 60)
	                || average >= 80) {

	            System.out.println("Eligible For Admission");

	            if (maths > 90 && physics > 90 && chemistry > 90) {
	                System.out.println("Eligible For Scholarship");
	            }

	        } else {

	            System.out.println("Not Eligible For Admission");
	        }

	        sc.close();

	}

}
