class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        
        int even=0;
        int odd=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0) even+=nums[i];
            else odd+=nums[i];
        }
        
        int[] ans= new int[queries.length];
        
        
        for(int i=0;i<queries.length;i++){
            
            
            int ind = nums[queries[i][1]];
            int aft=ind+queries[i][0];
            nums[queries[i][1]]=aft;
            
            if(ind%2==0 &&  aft%2==0){
                even+=queries[i][0];
            }else if(aft%2==0){
                
                even+=aft;
            }else if(ind%2==0 && aft%2!=0){
            
            
            even=even-ind;
            
            
        }
            
            ans[i]=even;
            
        }
        
        
        
        
        
        return ans;
        
        
    }
}