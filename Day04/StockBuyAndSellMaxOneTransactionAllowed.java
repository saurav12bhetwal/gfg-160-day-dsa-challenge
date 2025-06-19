// User function Template for Java

class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int max=0;
        int current =0;
        for(int i=0;i<=prices.length-2;i++){
                current += (prices[i+1]-prices[i]);
                if(current>max){
                max=current;
                }else if(current<0){
                    current =0;
                }
        }
        return max;
    }
}