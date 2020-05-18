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
		    for (int counter=0;counter<T ;counter++ ){
		        int activities_no=sc.nextInt();
		        String origin=sc.next();
		        int laddos=0;
		        for(int j=0;j<activities_no;j++){
		            String activities=sc.next();
		            if(activities.equals("CONTEST_WON")){
		                int rank=sc.nextInt();
		                if(rank<20){
		                laddos+=300+20-rank;
		            }
		            else
		            laddos+=300;
		            }
		            if(activities.equals("TOP_CONTRIBUTOR")){
		                
		                laddos+=300;
		            }
		            if(activities.equals("BUG_FOUND")){
		                int severity=sc.nextInt();
		                laddos+=severity;
		            }
		            if(activities.equals("CONTEST_HOSTED")){
		          
		                laddos+=50;
		            }
		            
		        }
		        
		        if(origin.equals("INDIAN")){
		                System.out.println(laddos/200);
		        }
		        else
		        System.out.println(laddos/400);
		    } 
		    
		}catch(Exception e){
		    
		}
	}
}
