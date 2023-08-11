class Solution {
    public int minDifference(int[] nums) {
        Arrays.sort(nums);
      if(nums.length<=4) return 0;
        
        int min=nums[0];
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
           
        
        int ans=max-min;
        
        ans=Math.min(ans,nums[nums.length-4]-nums[0]);
        ans=Math.min(ans,nums[nums.length-3]-nums[1]);
        ans=Math.min(ans,nums[nums.length-2]-nums[2]);
        ans=Math.min(ans,nums[nums.length-1]-nums[3]);

        return ans;
        
        
    }
}