class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int result=0,currentSum=0,start=0;
        Set<Integer> s=new HashSet<>();
        for(int i =0;i<nums.length;i++){
            while(s.contains(nums[i])){
                s.remove(nums[start]);
                currentSum-=nums[start];
                start++;
            }
        
        currentSum+=nums[i];
        s.add(nums[i]);
    result=Math.max(result,currentSum);    
    }
    return result;

}}