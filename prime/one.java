import java.util.*;

class one{
    public static void main(String args[]){
        int n , flag = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        n = sc.nextInt();

        for(int i = 2; i < n; i++){
            if(n % i == 0)
            {
                flag++;
            }
            }
            if(flag == 0)
            {
                System.out.print("prime");
            }
            else
            {
                System.out.print("not prime");
            }
        }
    }
