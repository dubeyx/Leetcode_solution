class Solution {
    int ans=Integer.MAX_VALUE;
    int[][] glob;
    public int mctFromLeafValues(int[] arr) {
        
        glob= new int[arr.length+1][arr.length+1];
        
        for(int i=0;i<glob.length;i++)
            for(int j=0;j<glob.length;j++)
                glob[i][j]=-1;
        
        
        
       int x= helper(arr,0,arr.length-1);
        
        
        
       return x; 
        
    }
    
    public int helper(int[] arr, int p, int q){
        if(glob[p][q]!=-1) return glob[p][q];
        if(p==q) return glob[p][q]=0;
        
        int jum=Integer.MAX_VALUE;;
        for(int i=p;i<q;i++){
            int sum=0;
            sum+=max(arr,p,i)*max(arr,i+1,q);
            sum+=helper(arr,p,i);
            sum+=helper(arr,i+1,q);
            
            jum=Math.min(jum,sum);
        }
   
         
        
        return glob[p][q]=jum;
    }
    
    
    public int max(int[] arr, int p, int q){
        
        int pns=Integer.MIN_VALUE;
        
        for(int i=p;i<=q;i++){
            pns=Math.max(pns,arr[i]);
        }
        
        
        return pns;
        
        
    }
    
    
    
    
    
    
}