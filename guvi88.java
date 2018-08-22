import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
				 int n1 , n2, lcm;
       Scanner s=new Scanner(System.in);
       
    System.out.println("enter the first number");
        n1=s.nextInt();
      System.out.println("enter the second number");
   n2=s.nextInt();
        lcm = (n1 > n2) ? n1 : n2;

       
        while(true)
        {
            if( lcm % n1 == 0 && lcm % n2 == 0 )
            {
                System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
                break;
            }
            ++lcm;
        }
	}
}
