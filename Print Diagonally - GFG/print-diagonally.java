//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            
            int matrix[][] = new int[n][n];
            
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.downwardDiagonal(n, matrix);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static ArrayList<Integer> downwardDiagonal(int N, int A[][])
    {
        ArrayList<Integer> list = new ArrayList<>();
        int m = A.length;
        int n = A[0].length ;
        for(int k = 0 ; k<m ; k++){
            int  i = 0;
            int j = k;
            while(j>=0){
                list.add(A[i][j]);
                i++;
                j--;
            }
        }
        for(int k = 1 ; k<n ; k++){
            int  i = k;
            int j = n-1;
            while(i<n){
                list.add(A[i][j]);
                i++;
                j--;
            }
        }
        return list;
    }
}
