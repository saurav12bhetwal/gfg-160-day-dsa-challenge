// User function Template for Java
class Solution {
    // Function to find hIndex
    public int hIndex(int[] citations) {
        // code here
        int n=citations.length;
        int freq[]=new int[n+1];
        for(int i=0;i<n;i++){
            if(citations[i]>=n){
                freq[n]++;
            }else{
                freq[citations[i]]++;
            }
        }
        int s=freq[n];
        int idx=n;
        while(s<idx){
            idx--;
            s+=freq[idx];
        }
        return idx;
    }
}