
class Solution {
    // Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2) {
        // Your code here
        if(s1.length()!=s2.length()){
            return false;
        }
        s1=s1+s1;
        int n=s1.length();
        int m=s2.length();
        int lps []= lpsArray(s2);
        
        int i=0;
        int j=0;
        while(i<n){
            if(s1.charAt(i)==s2.charAt(j)){
                j++;
                i++;
            }
            if(j==m){
                return true;
            }
            else if(i<n && s1.charAt(i)!=s2.charAt(j)){
                if(j!=0){
                    j=lps[j-1];
                }else{
                    i++;
                }
            }
        }
        return false;
       
    }
    public static int[] lpsArray(String s){
        int n=s.length();
        int lps[]=new int[n];
        int i=1;
        int len=0;
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