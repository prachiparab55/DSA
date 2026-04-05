import java.util.Scanner;

public class ArraysCC {
    public static void main(String args[]) {

        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);

        System.out.println("Length of array = " + marks.length);

        // Taking input
        System.out.print("Enter Physics marks: ");
        marks[0] = sc.nextInt();

        System.out.print("Enter Chemistry marks: ");
        marks[1] = sc.nextInt();

        System.out.print("Enter Maths marks: ");
        marks[2] = sc.nextInt();

        // Printing values
        System.out.println("Physics: " + marks[0]);
        System.out.println("Chemistry: " + marks[1]);
        System.out.println("Maths: " + marks[2]);

        // Calculating percentage
        int percentage = (marks[0] + marks[1] + marks[2]) / 3;

        System.out.println("Percentage = " + percentage + "%");

        sc.close();
    }
}
