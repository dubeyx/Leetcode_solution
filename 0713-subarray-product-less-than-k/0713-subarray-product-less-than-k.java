class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        int ans=0;
        
        int count=0;
        int mult=1;
        int j=0;
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]>=k){
                count=0;
                mult=1;
                j=i+1;
                continue;
            }
            
            mult=mult*nums[i];
            if(mult<k) {
               
                ans+=(i-j+1);
            }else{
                
                while(mult>=k){
                    mult=mult/nums[j];
                    j++;
                }
                
                ans+=(i-j+1);
                
            }
            
            
            
            
        }
        
        return ans;
        
    }
}