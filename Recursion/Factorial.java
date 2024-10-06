package recursion;

public class fact {

    public static int factorial(int n) {

        if (n == 1) {
            return 1;
        }
        int fact_n = factorial(n - 1);
        int fact_no = n * fact_n;
        return fact_no;
    }

    public static void main(String[] args) {

        int n = 5;
        int result = factorial(n);
        System.out.println(result);
    }
}
