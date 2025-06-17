// User function Template for Java

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        d=d%arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,arr.length-1-d);
        reverse(arr,arr.length-d,arr.length-1);
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