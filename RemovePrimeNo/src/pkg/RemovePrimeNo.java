package pkg;

import java.util.ArrayList;
import java.util.Arrays;

public class RemovePrimeNo 
{
    public static boolean isprime(int n)
    {
    	int num=n, temp;
  	  boolean flag = true;
  	 
  	  for (int i = 2; i<= num/2; i++) {
  	   temp = num%i;
  	   if (temp == 0) {
  	    flag = false;
  	    break;
  	   }
  	  }
  	  return flag;
  	  
    }
	
	public static void removeprime( ArrayList<Integer> list )
    {
    	int a=list.size();
    	System.out.println("size of list is "+a);
    	for(int i=a-1; i>=0; i--)
    	{
    		int n=list.get(i);
    		if(isprime(n)==true)
    		{
    			list.remove(i);
    		}	
        }

    }
    public static void main(String[] args) 
    {
    	Integer [] arr= {1,2,4,7,9};
    	ArrayList<Integer> list= new ArrayList<>(Arrays.asList(arr));
    	System.out.println(list);
    	RemovePrimeNo.removeprime(list);
    	
    	System.out.println(list);
		
	}
}

    
