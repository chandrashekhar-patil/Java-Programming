import java.util.*;

public class one {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First NO : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second NO : ");
        int b = sc.nextInt();
        System.out.print("Enter the Three NO : ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.print("Largest No : " + a);
            System.out.println();
        } else if (b > a && b > c) {
            System.out.print("Largest No : " + b);
            System.out.println();
        } else {
            System.out.print("Largest No : " + c);
            System.out.println();

        }
    }
}