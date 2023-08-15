class Solution {
    public int subarraySum(int[] nums, int goal) {
        
        
        Map<Integer,Integer> mp= new HashMap<>();
        int sum=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            
            
            mp.put(sum,mp.getOrDefault(sum,0)+1);
            sum+=nums[i];
            ans+=mp.getOrDefault(sum-goal,0);
            
            
            
            
            
            
        }
        
        
        
        return ans;
        
    }
}