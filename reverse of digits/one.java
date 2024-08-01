import java.util.*;
class one {
    public static void main(String[] args) {
        int n , r , sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ; ");
        n = sc.nextInt();

        while(n != 0)
        {
            r = n % 10;
            sum = sum * 10 + r;
            n = n / 10;
        }
        System.out.print("reverse digits : " + sum);
        System.out.println();
    }
    
}
