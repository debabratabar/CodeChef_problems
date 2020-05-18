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
		    
		    Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int counter = 0; counter < T; counter++) {
            long K = sc.nextLong();
            long d0 = sc.nextLong();
            long d1 = sc.nextLong();
            long s= d0+d1;
            long total_sum=s;
            long term=(K-3)/4;
                    long extra=(K-3)%4;

                total_sum+=term*((2*s)%10+(4*s)%10+(8*s)%10+(6*s)%10);


            if(extra==1){
                total_sum+=(2*s%10);
            }
            if(extra==2){
                total_sum+=((2*s)%10+(4*s)%10);
            }
            if(extra==3){
                total_sum+=((2*s)%10+(4*s)%10+(8*s)%10);
            }
            if(total_sum%3==0){
                System.out.println("YES");
            }
            else
                System.out.println("NO");

        }

        }catch(Exception e){
		    
		}
	}
	}
