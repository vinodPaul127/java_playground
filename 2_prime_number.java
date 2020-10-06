/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   for (int m=100;m<=10000;m++){
	        int given_input_number=m;
	    int  count=0;
	    for (int k=1;k<=given_input_number;k++)
	    {
	        if(given_input_number%k==0)
	        {
	           // System.out.println("true");
	            count=count+1;
	        }
	    }
	    if(count==2){
	        System.out.println(m+" is prime number");
	        count=0;
	    }
	   }
	}
}
