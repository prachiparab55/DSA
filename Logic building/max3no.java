import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1st no:");
        int a = sc.nextInt();
        
        System.out.println("Enter 2nd no:");
        int b = sc.nextInt();
        
        System.out.println("Enter 3rd no:");
        int c = sc.nextInt();
        
        int max;
        if (a>b && a>c){
            max = a;
        } else if (b>c){
            max = b;
        } else{
            max = c;
        }
        System.out.println("Maximum:" + max);
    }
}
