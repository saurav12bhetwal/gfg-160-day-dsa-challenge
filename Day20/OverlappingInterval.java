class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        // Code here // Code here
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> merge=new ArrayList<>();
        for(int []a:arr){
            if(merge.isEmpty() || merge.get(merge.size()-1)[1]<a[0]){
                merge.add(a);
            }else{
                int list[]=merge.get(merge.size()-1);
                list[1]=Math.max(list[1],a[1]);
            }
        }
        return merge;
    }
}