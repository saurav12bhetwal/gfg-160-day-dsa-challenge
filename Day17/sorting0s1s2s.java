class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high){
            switch(arr[mid]){
                
            case 0:
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
                break;
                case 1:
                 mid++;
                 break;
                 case 2:
                     int temp1=arr[high];
                     arr[high]=arr[mid];
                     arr[mid]=temp1;
                     high--;
                     break;
            }
                
        }
        
    }
}