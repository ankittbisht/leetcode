//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new Solution().evaluatePostFix(br.readLine().trim()));
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        Stack<Integer> s = new Stack<>();
        for(int i = 0 ; i<S.length() ; i++){
            char c  = S.charAt(i);
            if(Character.isDigit(c)){
                s.push(c - '0'); //gives an integer value
            }else{
                int val1 = s.pop();
                int val2 = s.pop();
                
                switch (c) {
                case '+':
                    s.push(val2 + val1);
                    break;
                case '-':
                    s.push(val2 - val1);
                    break;
                case '/':
                    s.push(val2 / val1);
                    break;
                case '*':
                    s.push(val2 * val1);
                    break;
                }
            }
        }
        return s.pop();
    }
}