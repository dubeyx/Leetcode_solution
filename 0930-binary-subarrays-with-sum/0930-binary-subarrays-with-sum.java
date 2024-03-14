class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer,Integer> mp= new HashMap<>();
        
     int[] dp= new int[nums.length+1];
        
        for(int i=0;i<nums.length;i++){
            dp[i+1]=dp[i]+nums[i];        }
        
        int ans=0;
        
        for(int i : dp){
            
            ans+=mp.getOrDefault(i,0);
            mp.put(i+goal,mp.getOrDefault(i+goal,0)+1);
            
            
            
            
        }
        
        
        return ans;
        
    }
}


// 1
// 1
// 2
// 2
// 3



// 0
// 1
// 1
// 2
// 2
// 3