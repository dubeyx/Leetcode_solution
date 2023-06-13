class Solution {
    public int equalPairs(int[][] grid) {
        
    Map<String, Integer> mp=new HashMap<>();
        int ans=0;
        for(int i=0;i<grid.length;i++)
        {
            String s="";
            for(int j=0;j<grid[0].length;j++)
            {
                s=s+ " " + grid[i][j]+ " ";
            }
            
            mp.put(s,mp.getOrDefault(s,0)+1);
            
        }
           for(int i=0;i<grid.length;i++)
        {
            String s="";
            for(int j=0;j<grid[0].length;j++)
            {
                s=s+" " + grid[j][i]+ " ";
            }
            
            if(mp.containsKey(s)) ans=ans+mp.get(s);
            
        }
        
        
        
        
     // System.out.println(mp);  
        
        
        
        
        
        
        
        
        return ans;
        
        
    }
}