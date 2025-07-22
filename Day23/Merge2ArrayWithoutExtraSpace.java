class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
        int n=a.length;
        int m=b.length;
        int gap=(n+m+1)/2;
        while(gap>0){
            int i=0;
            int j=gap;
            while(j<n+m){
                int val1,val2;
                if(i<n) val1=a[i];
                else val1=b[i-n];
                
                if(j<n) val2=a[j];
                else val2=b[j-n];
                
                if(val1>val2){
                    if(i<n && j<n){
                        int temp= a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }else if(i<n){
                        int temp=a[i];
                        a[i]=b[j-n];
                        b[j-n]=temp;
                    }else{
                        int temp = b[i-n];
                        b[i-n] = b[j-n];
                        b[j-n] = temp;
                    }
                }
                i++;
                j++;
            }
            if(gap==1){
                gap=0;
            }
            else{
                gap = (gap+1)/2;
            }
        }
    }
}
