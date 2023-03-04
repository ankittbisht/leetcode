//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int N = Integer.parseInt(S[0]);
            int L = Integer.parseInt(S[1]);
            int R = Integer.parseInt(S[2]);

            Solution ob = new Solution();
            System.out.println(ob.setAllRangeBits(N,L,R));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int setAllRangeBits(int N , int L , int R) {
        // code here
        int range = (((1 << (L - 1)) - 1) ^
                    ((1 << (R)) - 1));
     
        return (N | range);
    }
};