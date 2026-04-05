/*
     Question:
     Write a Java program to demonstrate passing an array as a function argument.
     Create a function that increases each element of the array by 1
     and print the updated array.
*/

import java.util.Scanner;

public class ArraysCC {

    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String args[]) {
        int marks[] = { 97, 98, 99 };

        update(marks);

        // to print marks
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
