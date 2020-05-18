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
            int T = sc.nextInt();
            for (int counter = 0; counter < T; counter++) {
                int N = sc.nextInt();
                int[] carsSpeed = new int[N];
                for (int i = 0; i < N; i++) {
                    carsSpeed[i] = sc.nextInt();
                }
                int maximum_speed = 0;
                int prevCarSpeed=(int)Double.POSITIVE_INFINITY;
                for (int i = 0; i < N ; i++) {
                    if (prevCarSpeed>= carsSpeed[i]) {
                        maximum_speed++;
                        prevCarSpeed=carsSpeed[i];
                    }

                }
                System.out.println(maximum_speed);

            }
        }catch (Exception e){

        }
		
	}
}
