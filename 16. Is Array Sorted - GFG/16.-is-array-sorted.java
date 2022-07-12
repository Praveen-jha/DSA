// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            int arr[] = new int[n];
            
            String str[] = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(str[i]);
            
            System.out.println(new Solution().isSorted(arr, n));
            
        }
    }
    
}// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Complete the function
    public static int isSorted(int arr[], int n)
    {
       /// Your code here
       
        boolean inc=false,dec=false;
	      // incremrnt check
	      int i;
	      for( i=1;i<n;i++){
	          if(arr[i-1]>arr[i]){
	              break;
	          }
	      }
	      if(i==n){
	          inc=true;
	      }
	      
	      // Decrement check
	      int j;
	      for( j=1;j<n;j++){
	          if(arr[j-1]<arr[j]){
	              break;
	          }
	      }
	      if(j==n){
	          inc=true;
	      }
	      
	      
	      if (inc || dec){
	          return 1;
	      }
	      else {
	          return 0;
	      }
     }
}

