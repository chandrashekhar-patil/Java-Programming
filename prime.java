//print the prime number 1 to 100
//and sum and all number
public class prime 
{
    public static void main(String args[])
    {
     
        int sum = 0;
        int n = 100;
        System.out.println("1 to 100 Prime Numbers : ");

        for(int i = 2; i <= n; i++)
        {
            boolean isPrime = true;
            for(int j = 2; j <= Math.sqrt(i); j++)
            {
                if(i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
            System.out.print(" " + i);
            sum = sum + i;
        }
        System.out.println("\nSum : " + sum);
    }
}