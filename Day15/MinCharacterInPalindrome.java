// User function Template for Java

class Solution {
    public static int minChar(String s) {
        // Write your code here
        int n=s.length();
        StringBuilder rev = new StringBuilder(s);
        String reverse = rev.reverse().toString();
        s=s+"$"+reverse;
        int lps[]=lpsArray(s);
        return n-lps[lps.length-1];
    }
    public static int[] lpsArray(String s){
        int n=s.length();
        int len=0;
        int i=1;
        int lps[]=new int[n];
        
        while(i<n){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len!=0){
                    len=lps[len-1];
                }else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;
    }
}