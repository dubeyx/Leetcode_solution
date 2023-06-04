class Solution {
    public int findCircleNum(int[][] ic) {
        
        LinkedList<Integer>[] l = new LinkedList[ic.length];
        for(int i=0;i<ic.length;i++)
        {
            l[i]= new LinkedList<>();
            l[i].add(i);
        }
        
        for(int i=0;i<ic.length;i++)
        {
            for(int j=0;j<ic[0].length;j++)
            {
                if(i!=j)
                {
                   if(ic[i][j]==1) l[i].add(j);
                }
            }
        }
        
        
        boolean[] b = new boolean[ic.length];
        Queue<Integer> q = new LinkedList();
        int ans=0;
        for(int i=0;i<b.length;i++)
        {
            if(b[i]==false)
            {
                ans=ans+ help(q,b,i,l);
            }
        }
       
        
    return ans;    
        
    }
    
  public int help(Queue<Integer> q , boolean[] b , int a,LinkedList<Integer>[] l)
  {
      
    if(b[a]==true) return 0;
      
      q.add(a);
      b[a]=true;
        while(!q.isEmpty())
        {
           int t=q.poll();
            for(int y:l[t])
            {
               if(b[y]==false) q.add(y);
                b[y]=true;
            }
            
            
        }
      
      
      return 1;
      
  }
     
}