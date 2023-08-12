
class Solution {
    public int minIncrements(int n, int[] cost) {
        int ans=0;
        
       for(int i=cost.length-1;i>0;){
           
              ans+= Math.abs(cost[i]-cost[i-1]);
            cost[(i-1)/2]+=Math.max(cost[i],cost[i-1]);
           
           i=i-2;
           
       }
        
      //  for(int u : cost) System.out.print(u+" ");
        
        
        
        
    return ans;    
        
    }
}