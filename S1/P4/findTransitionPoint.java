//{ Driver Code Starts
import java.util.*;

class Sorted_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            System.out.println(obj.transitionPoint(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class Solution {
    int transitionPoint(int arr[], int n) {
        int low = 0;
        int high = n - 1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == 1 && (mid == 0 || arr[mid - 1] == 0)){
                return mid;
            }
            else if(arr[mid] == 1){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
        
    }
}