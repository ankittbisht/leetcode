//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);

            int[] ans = new Solution().printKClosest(arr, n, k, x);
            for (int xx : ans) {
                System.out.print(xx + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class pair implements Comparable<pair>{
   int diff;
   int key;
   pair(int diff,int key){
       this.diff=diff;
       this.key=key;
   }
    public int compareTo(pair p1){
        if(this.diff-p1.diff==0)
            return this.key- p1.key;
        else
            return p1.diff - this.diff;
}
   
}
class Solution {
    int[] printKClosest(int[] arr, int n, int k, int x) {
        // code here
    int ans[] = new int[k];
    PriorityQueue<pair> pq = new PriorityQueue<>();
    for(int i=0;i<n;i++){
        if(arr[i]!= x){
        pair p = new pair(Math.abs(x-arr[i]) ,arr[i]);
        pq.add(p);
        }
        if(pq.size()>k){
            pq.poll();
            
        }
    }
    for(int i=k-1;i>=0;i--){
        ans[i] = pq.poll().key;
    }
    
    return ans;
    }
}