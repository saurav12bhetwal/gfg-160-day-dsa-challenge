class Solution {
    int maxProduct(int[] arr) {
        // code here
        int currentmin=arr[0];
        int currentmax=arr[0];
        int maxvalue=arr[0];
        
        for(int i=1;i<arr.length;i++){
            int temp=Math.max(arr[i],Math.max(currentmin*arr[i],currentmax*arr[i]));
            currentmin=Math.min(arr[i],Math.min(currentmin*arr[i],currentmax*arr[i]));
            currentmax=temp;
            if(currentmax>maxvalue){
                maxvalue=currentmax;
            }
        }
        return maxvalue;
    }
}