//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int i = sc.nextInt();

            Solution obj = new Solution();
            obj.bitManipulation(n, i);
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static void bitManipulation(int num, int i) {
        // cod
        int get = 0;
        int bitmask = 1<<(i-1) ;
        
        if((num & (bitmask))==0){
            get = 0;
        }else{
            get = 1;
        }
        System.out.print(get+" ");
        System.out.print((num |(bitmask))+ " ");
        System.out.print(num & (~(bitmask)));
    }
}
