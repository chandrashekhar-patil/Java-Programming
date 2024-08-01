import java.util.*;

class one {
    public static void main(String args[]) {
        int n, r, sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        n = sc.nextInt();

        while (n > 0) {
            r = n % 10;
            sum = sum + r;
            n = n / 10;
        }
        System.out.print("Sum of Digits : " + sum);
        System.out.println();
    }
}