import java.util.*;
class one
{
    public static void main(String args[])
    {
        int n,r,sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = sc.nextInt();

        int t = n;
        while(n != 0){
            r = n % 10;
            sum += r * r * r;
            n = n / 10;
        }
        if(t == sum)
        {
            System.out.print("Arms no");
        }
        else
        {
            System.out.print("no Arms");
        }
   }
}