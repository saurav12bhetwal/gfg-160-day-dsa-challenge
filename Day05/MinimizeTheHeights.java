// User function Template for Java

class Solution {
    int getMinDiff(int[] arr, int k) {
        // code here
        int n=arr.length-1;
       Arrays.sort(arr);
       int r=arr[n]-arr[0];
       int sm=arr[0]+k;
       int lg=arr[n]-k;
       for(int i=1;i<=n;i++){
           if(arr[i]-k <0){
               continue;
           }
           int min=Math.min(arr[i]-k,sm);
           int max=Math.max(arr[i-1]+k,lg);
          r=Math.min(r,max-min);
       }
       return r;
    }
}
