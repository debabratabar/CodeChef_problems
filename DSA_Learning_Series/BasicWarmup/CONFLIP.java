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
		    int T=sc.nextInt();
		    for(int counter=0;counter<T;counter++){
		        int G=sc.nextInt();
		        int result=0;
		        for(int No_of_games=0;No_of_games<G;No_of_games++){
		            
		            
		            int I=sc.nextInt();
		            int N=sc.nextInt();
		            int Q=sc.nextInt();
		           result=N/2;
		            
		            if(I==1 && Q==1){
		               result=result;
		                
		            }else if(I==1 && Q==2){
		                result=N-result;
		            }
		            else if(I==2 && Q==1){
		                result=N-result;
		            }
		            else
		            result=result;
                    		   System.out.println(result);
                    		   result=0;
		    }

		    
		}
		}catch(Exception e){
		    
		}
	}
}
