class Solution {
    public int longestPalindromeSubseq(String s) {

int[][] dp= new int[s.length()][s.length()];

for(int i=0;i<s.length();i++){
    dp[i][i]=1;
}



for(int i=s.length()-1;i>=0;i--){
    for(int j=i+1;j<s.length();j++){

if(s.charAt(i)==s.charAt(j)){
    dp[i][j]=dp[i+1][j-1]+2;
}else{
    dp[i][j]=Math.max(dp[i][j-1],dp[i+1][j]);
}




    }
    
    
}

        
        
//         for(int i=0;i<s.length();i++)
//             for(int j=0;j<s.length();j++){
//                 System.out.println(dp[i][j]+" ");
//             }
        
        
        
        

return dp[0][s.length()-1];
        
    }
}