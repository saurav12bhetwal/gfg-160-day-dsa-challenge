class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int first = firstSeen(arr,target);
        if(first==-1){
            return 0;
        }
        int last = lastSeen(arr,target);
        return last-first+1;
    }
    public static int firstSeen(int arr[],int target){
        int s=0,e=arr.length-1,result=-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]==target){
                result =mid;
                e=mid-1;
            }else if(arr[mid]< target){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return result;
    }
    public static int lastSeen(int arr[],int target){
        int s=0,e=arr.length-1,result=-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]==target){
                result =mid;
                s=mid+1;
            }else if(arr[mid]< target){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return result;
    }
}
