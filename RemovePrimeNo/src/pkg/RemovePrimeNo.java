package pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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
    		if(isprime(n))
    		{
    			list.remove(i);
    		}	
        }

    }
    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("please enter array size");
    	int lenth=sc.nextInt();
    	ArrayList<Integer> list= new ArrayList<>();
    	System.out.println("Enter your Integer array here ");
    	for(int i=0;i<lenth;i++)
    	{
    		list.add(sc.nextInt());
    	}
    	System.out.println(list);
    	RemovePrimeNo.removeprime(list);
    	
    	System.out.println(list);
		
	}
}

    
