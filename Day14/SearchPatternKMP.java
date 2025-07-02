package Day14;


// User function Template for Java

class Solution {

    ArrayList<Integer> search(String pat, String txt) {
        // your code here
        ArrayList<Integer> result =new ArrayList<>();
        int N=txt.length();
        int M=pat.length();
        
        if(M==0 || N<M){
            return result;
        }
        int lps[]=lpsArray(pat);
        int i=0;
        int j=0;
        while(i<N){
            if(txt.charAt(i)==pat.charAt(j)){
                i++;
                j++;
            }
            if(j==M){
                result.add(i-j);
                j=lps[j-1];
            } else if(i<N && txt.charAt(i) !=pat.charAt(j)){
                if(j!=0){
                    j=lps[j-1];
                }else{
                    i++;
                }
            }
        }
        return result;
    }
    public int[] lpsArray(String pat){
        int M=pat.length();
        int lps[]=new int[M];
        int len=0;
        int i=1;
        while(i<M){
            if(pat.charAt(i)==pat.charAt(len)){
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