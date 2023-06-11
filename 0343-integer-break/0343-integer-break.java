class Solution {
    
    int[] dp;
    public int integerBreak(int n) {
        
       if(n==2) return 1;
        
        dp= new int[n+1]; 
        
       return helper(n,0);
        
    }
    
    public int helper(int n, int k){
        if(dp[n]!=0) return dp[n];
        if(n<=1) return dp[n]=1;
        if(n==2 && k>=1) return dp[n]=2;
        else if(n==2) return 1;
        int mx=Integer.MIN_VALUE;
     
        for(int i=1;i<n;i++){
            
            mx=Math.max(mx,i*helper(n-i,k+1));
            mx=Math.max(mx,i*(n-i));
         
        }
        
        
      return dp[n]=mx;  
        
    }
}