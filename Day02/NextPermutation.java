class Solution {
    void nextPermutation(int[] arr) {
        // code here
       int length = arr.length;
       int i=length-2;
       while(i>=0 && arr[i]>=arr[i+1]){
           i--;
       }
       int j=length-1;
       if(i>=0){
       while(arr[j]<=arr[i]){
           j--;
       }
       swap(arr,i,j);
       }
       reverse(arr,i+1,length-1);
    }
    public static void swap(int arr[],int s,int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
    public static void reverse(int arr[],int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}