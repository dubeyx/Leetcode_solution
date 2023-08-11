class Solution {
    int[][] dp;
    public int change(int amount, int[] coins) {
        int ans=0;
        dp= new  int[coins.length][5002];
        
        
    for(int i=0;i<dp.length;i++){
        for(int j=0;j<dp[0].length;j++){
            dp[i][j]=-1;
        }
    }
        
            ans+=help(amount,coins,0,0);
            
   
        
        
        
        
        return ans;
        
    }
    public int help(int amount, int[] coins,  int sum,  int j){
        if(sum>amount) return 0;
        // System.out.println(sg);
        if(dp[j][sum]!=-1) return dp[j][sum];
        if(sum==amount){ return 1;}
        int s=0;
        
        for(int i=j;i<coins.length;i++){
            
           s+= help(amount, coins,sum+coins[i] , i);
           
            
        }
        

       return dp[j][sum]=s; 
    }
    
    
    
}