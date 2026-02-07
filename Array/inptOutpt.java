import java.util.*;

public class inptOutpt {
    public static void main (String[] args) {
        int marks[] = new int[100];

        //input in array
        Scanner sc = new Scanner(System.in);
        //int phy;
        //phy = sc.nextInt();

        marks[0] = sc.nextInt();      //phy
        marks[1] = sc.nextInt();      //chem
        marks[2] = sc.nextInt();      //math


        //output in array
        System.out.println("phy: " + marks[0]);
        System.out.println("chem: " + marks[1]);
        System.out.println("math: " + marks[2]);
    }
}