class Solution {
    int[] glob;
    public int[] processQueries(int[] queries, int m) {
        glob=new int[m+1];
        
        for(int i=1;i<=m;i++){
            glob[i]=i;
        }
        int[] ans= new int[queries.length];
        
        
        for(int i=0;i<ans.length;i++){
            
            int indx= search(queries[i]);
            update(indx);
            ans[i]=indx-1;
            
            
        }
        
        
        return ans;
        
    }
    public int search(int x){
        
        for(int i=0;i<glob.length;i++){
            if(glob[i]==x) return i;
        }
        
        return 0;
    }
    public void update(int x){
        int g=glob[x];
        
        for(int i=1;i<=x;i++){
            
            int temp=g;
            g=glob[i];
            glob[i]=temp;
            
            
            
        }
        
        
        
        
        
    }
    
  
}