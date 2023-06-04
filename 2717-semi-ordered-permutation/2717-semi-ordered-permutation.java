class Solution {
    public int semiOrderedPermutation(int[] nums) {
       
        int count=0;
        
        int i=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==1) break;
        }
        int j=nums.length-1;
        for(j=nums.length-1;j>=0;j--){
            if(nums[j]==nums.length) break;
        }
        
        int ans=i + (nums.length-1-j);
        if(j<i) ans=ans-1;
        
        return ans ;
    }
}