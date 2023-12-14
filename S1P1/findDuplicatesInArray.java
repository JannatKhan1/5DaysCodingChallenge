//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends

class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        HashSet<Integer> seenSet = new HashSet<>(); //for iteration 
        HashSet<Integer> duplicateSet = new HashSet<>(); // to store duplicates
        for(int i=0;i<n;i++){
            int currentElement = arr[i];
            if(!seenSet.contains(currentElement)){
                seenSet.add(currentElement);
            }
            else {
                duplicateSet.add(currentElement);
            }
        }

        if(duplicateSet.isEmpty()){
            duplicateSet.add(-1);
        }
         Integer [] duplicateArray = duplicateSet.toArray(new Integer[0]);
         Arrays.sort(duplicateArray);

         return new ArrayList<>(Arrays.asList(duplicateArray));
    }   
}