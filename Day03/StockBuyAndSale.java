// User function Template for Java
class Solution {
    public int maximumProfit(int prices[]) {
        // code here
        int max =0;
        int current=0;
        for(int i=0;i<=prices.length-2;i++){
           current =(prices[i+1]-prices[i])+max;
           max=Math.max(current,max);
        }
        return max;
    }
}