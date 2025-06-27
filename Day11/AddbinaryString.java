// User function Template for Java

class Solution {
    public String addBinary(String s1, String s2) {
        // code here
        int i=s1.length()-1;
        int j=s2.length()-1;
        int carray=0;
        StringBuilder sc=new StringBuilder();
        while(i>=0 || j>=0 || carray==1){
            int bit1=(i>=0)?s1.charAt(i)-'0':0;
            int bit2=(j>=0)?s2.charAt(j)-'0':0;
            int sum=bit1+bit2+carray;
            sc.append(sum%2);
            carray=sum/2;
            i--;
            j--;
        }
        while(sc.length()>=0 && sc.charAt(sc.length()-1)=='0'){
            sc.deleteCharAt(sc.length()-1);
        }
       return sc.reverse().toString();
    }
}