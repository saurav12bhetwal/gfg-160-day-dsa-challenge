class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        if(arr.length<2){
            return -1;
        }
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }
            if(arr[i]<max1 && arr[i]>max2){
                max2=arr[i];
            }
        }
        return max2==Integer.MIN_VALUE ? -1:max2;
    }
}