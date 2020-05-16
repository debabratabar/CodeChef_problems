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
            Scanner sc =new Scanner(System.in);
            int T = sc.nextInt();
            for(int counter=0;counter<T;counter++){
                String s=sc.next();
                String firstpair=new String();
                String Secondpair= new String();

                if(s.length()%2!=0){
                    firstpair = s.substring(0, s.length() / 2);
                    Secondpair = s.substring((s.length()/2 )+ 1, s.length());


                }
                else {

                    firstpair=s.substring(0,s.length()/2);
                    Secondpair=s.substring((s.length()/2),s.length());

                }
               
                int[] a1=new int[firstpair.length()];
                int[] a2 = new int[Secondpair.length()];
                boolean check=false;
                for (int i=0;i<firstpair.length();i++){
                    a1[i]=(int)firstpair.charAt(i);
                }

                for (int i=0;i<Secondpair.length();i++){
                    a2[i]=(int)Secondpair.charAt(i);
                }


                a1=sort(a1,firstpair.length());
                a2=sort(a2,Secondpair.length());
              
                for(int i=0;i<firstpair.length();i++){
                    check=true;
                    if(a1[i]!=a2[i]){
                        check=false;
                        break;
                    }

                }

                if(check==true){
                    System.out.println("YES");
                }
                else
                    System.out.println("NO");

            }

        }catch (Exception e ){

        }
    }
    public static  int[] sort(int[] arr, int size){
        for (int i=0;i<size;i++){
            for(int j=0;j<size-1-i;j++){

                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
       
        return  arr;
    }
}

