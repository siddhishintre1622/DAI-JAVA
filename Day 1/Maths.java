import java.util.*;

public class Maths 
{

    public static int factorial(int n)
    {

        int fact = 1;

        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }

        return fact;
    }


    public static boolean isPrime(int n)
    {
        //boolean ans=true;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i == 0)
            {
                
                return false;

            }
           
        }
        return true;

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ans = factorial(2);
        System.out.println(ans);

        System.out.println(isPrime(10));
        
    }
    
}
