class Solution {
    public int numberOfBeams(String[] bank) {
        
        int curr=0,ans=0;
        
        for(int i=0;i<bank.length;i++){
            
            int x= one(bank[i]);
            ans+=curr*x;
            if(x!=0) curr=x;
            
        }
        
        
        
        
        
        return ans;
    }
    
    public int one(String s){
        
        int cc=0;
        
        for(char c : s.toCharArray()){
            if(c=='1') cc++;
        }
        
        
       return cc; 
    }
    
    
    
}