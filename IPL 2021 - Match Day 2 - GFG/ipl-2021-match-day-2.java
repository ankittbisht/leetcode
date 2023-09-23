//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
    public static void main(String args[]) {
        // taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        // taking total count of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            // taking total number of elements
            int n = sc.nextInt();

            // taking size of subArrays
            int k = sc.nextInt();

            // Declaring and Intializing an array of size n
            int arr[] = new int[n];

            // adding all the elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Calling the method max_of_subarrays of class solve
            // and storing the result in an ArrayList
            ArrayList<Integer> res = new Solution().max_of_subarrays(arr, n, k);

            // printing the elements of the ArrayList
            for (int i = 0; i < res.size(); i++)
                System.out.print(res.get(i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    static class pair implements Comparable<pair>{
    int value;
    int idx;
    public pair(int value , int idx){
        this.value = value;
        this.idx = idx;
    }
    public int compareTo(pair p2){
        return p2.value - this.value;
    }
}
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        
        
        PriorityQueue<pair> pq = new PriorityQueue<>();
        ArrayList<Integer> al = new ArrayList<>();
        for(int  i = 0 ; i<k ; i++){
            pq.add(new pair(arr[i] , i));
        }
        al.add(pq.peek().value);
        
        for(int j = k ; j<n ; j++){
            while(pq.size()>0 && pq.peek().idx<=(j-k)){
                pq.remove();
            }
            pq.add(new pair(arr[j] , j));
            al.add(pq.peek().value);
        }
        return al ;
    }
}
