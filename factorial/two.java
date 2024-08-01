import java.util.*;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no : ");
        int n = sc.nextInt();

        int fact = factorial(n);
        System.out.print("Factorial : " + fact);
            System.out.println();

    }

    public static int factorial(int n) { //Recursive case 
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}