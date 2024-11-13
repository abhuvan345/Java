import SEE.Externals;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	System.out.print("Bhuvan. A\n 24BECS400\n");

        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = s.nextInt();
        Externals[] students = new Externals[n];

        // Input and calculate marks for each student
        for (int i = 0; i < n; i++) {
            System.out.println("\nEntering details for Student " + (i + 1) + ":");
            students[i] = new Externals();
            students[i].inputStudentDetails();
            students[i].inputCIEmarks();
            students[i].inputSEEmarks();
            students[i].calculateFinalMarks();
        }

        // Display final marks for each student
        System.out.println("\nFinal Marks of Students:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            students[i].displayFinalMarks();
        }
    }
}
