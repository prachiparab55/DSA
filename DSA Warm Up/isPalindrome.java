// 1. Goal: check whether a number reads the same forward and backward
// 2. Negative numbers cannot be palindromes, so return false immediately
// 3. Store the original number in a temporary variable
// 4. Create a variable to build the reversed number
// 5. Extract the last digit from the number
// 6. Add that digit to the reversed number
// 7. Remove the last digit from the original number
// 8. Repeat until all digits have been processed
// 9. Compare the reversed number with the original saved number
// 10. If both are equal, the number is a palindrome; otherwise it is not
// 11. Time Complexity: O(n), where n is the number of digits
// 12. Space Complexity: O(1), because only a few variables are used



import java.util.Scanner;

public class Solution {

    public static boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int r = 0;
        int temp = x;

        while (x != 0) {
            r = (r * 10) + (x % 10);
            x /= 10;
        }

        return r == temp;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " is a Palindrome Number");
        } else {
            System.out.println(num + " is NOT a Palindrome Number");
        }

        sc.close();
    }
}
