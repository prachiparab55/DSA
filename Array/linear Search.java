import java.util.Scanner;

public class Java {

    public static int LinearSearch(int marks[], int key) {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int marks[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 10;

        int index = LinearSearch(marks, key);
        if (index == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at index: " + index);
        }

    }
}
