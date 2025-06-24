class Solution {
    public int circularSubarraySum(int arr[]) {
        // code here
        int maxK=kadane(arr);
        int n=arr.length;
        if(maxK<0){
            return maxK;
        }
        int total=0;
        for(int i=0;i<n;i++){
            total +=arr[i];
            arr[i]=-arr[i];
        }
        
        int minsubarray=kadane(arr);
        int maxcircular=total+minsubarray;
        return Math.max(maxcircular,maxK);
    }
    public static int kadane(int []arr){
        int max=arr[0];
        int current = arr[0];
        for(int i=1;i<arr.length;i++){
            current = Math.max(arr[i],current+arr[i]);
            max=Math.max(current,max);
        }
        return max;
    }
}
