package Day10;
class Solution {
    public int myAtoi(String s) {
        // Your code here
        int n=s.length();
        int i=0;
        while(i<n && s.charAt(i)==' '){
            i++;
            if(i==n){
                return 0;
            }
        }
        int sign=1;
        if(s.charAt(i)=='+'){
            i++;
        }
        else if(s.charAt(i)=='-'){
            sign = -1;
            i++;
        }
        long result=0;
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';
            result=result*10+digit;
            i++;
        if(sign==1 && result>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(sign==-1 && -result<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        
        }
        return (int)result*sign;
        
    }
}
