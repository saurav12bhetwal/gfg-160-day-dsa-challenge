class Solution {
    public int minRemoval(int intervals[][]) {
        // code here
        if(intervals.length<1){
            return 0;
        }
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int count = 0;
        int prevEnd = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(prevEnd>intervals[i][0]){
                count++;
            }else{
                prevEnd = intervals[i][1];
            }
        }
        return count;
    }
}
