class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        List<Integer> list =new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length/3;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int num:map.keySet()){
            if(map.get(num)>n){
                list.add(num);
            }
        }
        Collections.sort(list);
        return list;
    }
}
