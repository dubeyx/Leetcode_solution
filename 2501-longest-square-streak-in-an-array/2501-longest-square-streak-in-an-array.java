class Solution {
    public int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);
        Map<Integer,Integer> mp= new HashMap<>();
        
        mp.put(nums[nums.length-1],1);
        
        for(int i=nums.length-2;i>=0;i--){
            
            
            if(mp.containsKey(nums[i]*nums[i])){
                mp.put(nums[i],mp.get(nums[i]*nums[i])+1);
            }else{
                mp.put(nums[i],1);
            }
            
            
        }
        
        
        int ans=-1;
      //  System.out.println(mp);
        
        for(Map.Entry<Integer,Integer> b : mp.entrySet()){
            
            if(b.getValue()>1){
                ans=Math.max(ans,b.getValue());
            }
            
        }
        
        
        
        
        
        return ans;
        
    }
}