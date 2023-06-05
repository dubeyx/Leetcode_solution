class Solution {
    public boolean checkStraightLine(int[][] c) {
        if(c.length==2) return true;
      if(c[0][0]-c[1][0]==0) 
         
         {
            for(int i=1;i<c.length;i++)
            {
                
                if(c[0][0]-c[i][0]!=0) return false;
                
                
            }
             
             
             
             
             
             
             
         }
         else{
         
         
         
         float n =(float) (c[0][1]-c[1][1])/(c[0][0]-c[1][0]);
         
        
        for(int i=2;i<c.length;i++)
        {
           float t = (float)(c[0][1]-c[i][1])/(c[0][0]-c[i][0]);
            
            if(n!=t) return false;
            
        }
        
         }
        
        
        return true;
        
        
    }
}