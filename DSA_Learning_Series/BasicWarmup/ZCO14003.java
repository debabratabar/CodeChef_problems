/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		
		  Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        long[] budget= new long[T];
        for(int counter=0;counter<T;counter++){
            budget[counter]=sc.nextInt();
        }
        Arrays.sort(budget);
        long[] profit = new long[T];
        for(int counter=0;counter<T;counter++){
            profit[counter]=budget[counter]*(T-counter);
        }
        Arrays.sort(profit);

        System.out.println(profit[T-1]);
		}catch(Exception e){
		    
		}
	}
}
