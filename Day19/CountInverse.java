
class Solution {
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        // Your Code Here
      return mergesort(arr,0,arr.length-1);
    }
    public static int mergesort(int arr[],int l,int r){
        int ans=0;
        if(l<r){
            int mid=l+(r-l)/2;
            int left = mergesort(arr,l,mid);
            int right = mergesort(arr,mid+1,r);
            ans=mergeandcount(arr,l,mid,r)+left+right;
        }
        return ans;
    }
    public static int mergeandcount(int arr[],int l,int mid,int r){
        int n=mid-l+1;
        int m=r-mid;
        int k=l;
        int ans=0;
        int L[]=new int[n];
        int R[]=new int [m];
        for(int i=0;i<n;i++){
            L[i] = arr[l+i];
        }
        for(int i=0;i<m;i++){
            R[i] = arr[mid+i+1];
        }
        int i=0;int j=0;
        while(i<n && j<m){
            if(L[i]<=R[j]){
                arr[k]=L[i];
                i++;
            }else{
                arr[k]=R[j];
                ans+=n-i;
                j++;
            }
            k++;
        }
        while(i<n){
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<m){
            arr[k]=R[j];
            j++;
            k++;
        }
        return ans;
    }
}