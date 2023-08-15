class Solution {
    public long getDescentPeriods(int[] price) {
        long ans=1;
        
        long count=1;
        for(int i=1;i<price.length;i++){
            
            
            if(price[i-1]==price[i]+1){count++; ans+=count;}
            else{
                count=1;
                ans+=count;
            }
            
            
        }
        
        
        
        
        return ans;
        
        
    }
}