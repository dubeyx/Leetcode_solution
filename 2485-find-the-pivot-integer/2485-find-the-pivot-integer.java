class Solution {
    public int pivotInteger(int n) {
        
        
        for(int i=1;i<=n;i++){
          
            int x = (i*(i-1))/2;
            int y = (((n-i)*(n-i+1))/2) + (n-i)*i;
            if(x==y) return i;
            
            
        }
        
        
        
        
        return -1;
        
    }
}