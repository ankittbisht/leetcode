//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
import java.lang.*;


class GFG {
	public static void main (String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine()); // input size of array
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split("\\s+");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
		    }
		    Solve T = new Solve();
            long ans = T.maxArea(arr,n);
            System.out.println(ans);
		}
	}
}

// } Driver Code Ends


//User function Template for Java


class Solve{
    
    long maxArea(int A[], int len){
        //
         int lp = 0 ;
        int Rp= len-1;
        int maxwater = 0 ;
        while(lp<Rp){
            int height = Math.min(A[lp], A[Rp]);
            int width = Rp - lp;
            int currwater = height*width ;
            maxwater = Math.max(maxwater,currwater);
            if(A[lp]<A[Rp]){
                lp++;
            }else{
                Rp--;
            }
        }
        return maxwater;
    }
    
}