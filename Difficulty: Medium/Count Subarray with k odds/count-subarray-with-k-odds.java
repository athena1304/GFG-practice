//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] nums = IntArray.input(br, n);
            
            
            int k;
            k = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            int res = obj.countSubarray(n, nums, k);
            
            System.out.println(res);
            
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


class Solution {
    private static int atMost(int nums[], int k){
        int count = 0, oddCount = 0, left = 0;

        for(int right = 0; right < nums.length; right++){
            if(nums[right] % 2 == 1){
                oddCount++;
            }

            while(oddCount > k){
                if(nums[left] % 2 == 1){
                    oddCount--;
                }
                left++;
            }

            count += (right - left + 1);
        }

        return count;
    }
    public static int countSubarray(int n, int[] nums, int k) {
        // code here
         return atMost(nums, k) - atMost(nums, k-1);
    }
}
        
