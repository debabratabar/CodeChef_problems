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
		 try {
                Scanner sc = new Scanner(System.in);
                int T=sc.nextInt();//number of test cases
                for (int counter=0;counter<T;counter++){//loop for all test cases
                    int num=sc.nextInt();
                    int countZero=0;
                    int check=num;
                    int quotient=check/5;
                    while (quotient!=0){
                        countZero+=quotient;
                        quotient/=5;
                    }

                    

                    System.out.println(countZero);
                }
            }catch ( Exception e){

            }
	}
}
