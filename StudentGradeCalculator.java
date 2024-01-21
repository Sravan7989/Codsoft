import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Grade Calculator");
        System.out.println("Enter No of Subjects");
        int num_of_Subjects = sc.nextInt();
        int total_marks = 0;
        for (int i = 0; i < num_of_Subjects; i++) {
            System.out.println("Enter Marks Obtained in " + (i + 1) +6 ":");
            int marks = sc.nextInt();
            total_marks += marks;
        }
        double averagePercentage = (double) total_marks / num_of_Subjects;
        char Grade;
        if (averagePercentage > 90) {
            Grade = 'O';
        } else if (averagePercentage >= 80) {
            Grade = 'B';
        } else if (averagePercentage >= 70) {
            Grade = 'C';
        } else if (averagePercentage >= 60) {
            Grade = 'D';
        } else if (averagePercentage >= 50) {
            Grade = 'E';
        } else {
            Grade = 'F';
        }
        System.out.println("Total Marks Scored is" + total_marks);
        System.out.println("Average Percentage is" + averagePercentage);
        System.out.println("Grade :" + Grade);
    }
}
