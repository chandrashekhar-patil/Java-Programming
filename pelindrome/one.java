package pelindrome;
import java.util.*;

class one {
    public static void main(String args[]) {
        int n, r, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number ");
        n = sc.nextInt();
        int t = n;

        while (n != 0) {
            r = n % 10;
            sum = sum * 10 + r;
            n = n / 10;
        }
        if (t == sum) {
            System.out.print("Pelindrome");
        } else {
            System.out.print("Not a Pelidrome");
        }
    }
}