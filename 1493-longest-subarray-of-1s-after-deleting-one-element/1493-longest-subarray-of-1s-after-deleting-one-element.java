class Solution {
    public int longestSubarray(int[] nums) {
        Map<Integer,Integer> mp= new HashMap<>();
        
        int count=0;
        int zeroIndex=-1;
        int zeroCount=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==0 && zeroCount==0){
                zeroIndex=i;
                zeroCount++;
            }else if(nums[i]==1){
                count++;
            }else if(nums[i]==0 && zeroCount>0){
                count=i-zeroIndex-1;
                zeroIndex=i;
                
            }
            //System.out.println(count);
            
            ans=Math.max(ans,count);
        }
        
        
        if(zeroCount==0) return ans-1;
        
        return ans;
        
    }
}