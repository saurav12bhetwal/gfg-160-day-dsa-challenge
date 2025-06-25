
class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
        int n=arr.length;
        int i=0;
        while(i<n){
            if(arr[i]>0&& arr[i]<=n&&arr[arr[i]-1]!=arr[i]){
            int temp=arr[i];
            arr[i]=arr[temp-1];
            arr[temp-1]=temp;
            }else{
                i++;
            }
        }
        for(int j=0;j<n;j++){
            if(arr[j]!=j+1){
                return j+1;
            }
        }
        return n+1;
        
    }
}
