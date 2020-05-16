/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args)  throws java.lang.Exception
	{
	    try{
		// your code goes here
		 Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        
            for (int counter = 0; counter < T; counter++) {
                int num = sc.nextInt();
                String s = Integer.toString(num);
                int size = s.length() - 1;

                int rem, finalNumber = 0;

                while (num > 0) {
                    rem = num % 10;
                    finalNumber += (rem * Math.pow(10, size--));

                    num /= 10;
                }
                System.out.println(finalNumber);
            }


        }catch (Exception e){}
	}
}
