/* package codechef; // don't place package name! */
/*Q1.  You are given an array of nonnegative integers. Let's say you start at the beginning of the array and are trying to advance to the end. You can advance at most, the number of steps that you're currently on. Determine whether you can get to the end of the array.
For example, given the array [1, 3, 1, 2, 0, 1], we can go from indices 0 -> 1 -> 3 -> 5, so return true.
Given the array [1, 2, 1, 0, 0], we can't reach the end, so return false.*/
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[]={3,0,0,0,0};
		System.out.println(max_path(arr,arr.length));
		
		
	}
	//Iterative Approach
	static boolean max_path(int arr[],int n)
	{
	   // int start=0;
	    int end;
	    boolean path[]= new boolean[n]; //to check if the pos is reachable or not
	    if(arr[0]==0)
	        return false;
	    path[0]=true;
	    for(int i=0;i<n;i++)
	    {
	        if(path[i] && arr[i]>0)
	        {
	            end=arr[i];
	            for(int nxt=1;nxt <= end;nxt++) //iterating it the step no of times
	            {
	                if(i+nxt < path.length)
	                {
	                    path[i+nxt]=true;
	                }
	            }
	        }
	    }
	   return path[arr.length-1]; //if last pos is reachable 
	}
}
