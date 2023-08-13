class Solution {
    int[] dp;
    public boolean validPartition(int[] nums) {
        dp= new int[nums.length+1];
        
        
        return helper(nums, 0);
    }
    
    public boolean helper(int[] nums, int i){
        
        if(i>=nums.length) return true;
        
        if(dp[i]>0) return dp[i]==1?true:false;
        
        if(i+1<nums.length && nums[i]==nums[i+1]){
            boolean a=false;
            boolean b=false;
            
            if(i+2<nums.length && nums[i+1]==nums[i+2]) a= helper(nums,i+3);
            
            b=helper(nums,i+2);
            
            if(b==true) dp[i]=1;
            else dp[i]=2;
            
            return a||b;
            
        }
        
        
        if(i+2<nums.length && nums[i]==nums[i+1]-1 && nums[i+1]==nums[i+2]-1){
            
            boolean x= helper(nums,i+3);
                dp[i]=(x==true)?1:2;
            return x;
        }
        
        dp[i]=2;
        return false;
        
    }
    
    
    
}