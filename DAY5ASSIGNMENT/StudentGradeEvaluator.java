package DAY5ASSIGNMENT;
import java.util.Scanner;

public class StudentGradeEvaluator {
	public static String getGrade(int marks) {
        if (marks >= 80) {
            return "A Grade";
        } else if (marks >= 60) {
            return "B Grade";
        } else if (marks >= 40) {
            return "C Grade";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        String grade = getGrade(marks);

        System.out.println("Grade: " + grade);
        sc.close();
    }

}
