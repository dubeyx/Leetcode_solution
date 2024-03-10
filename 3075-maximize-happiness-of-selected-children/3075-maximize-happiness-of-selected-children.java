class Solution {
    public long maximumHappinessSum(int[] happi, int k) {
        
PriorityQueue<Long> pq= new PriorityQueue<>(Collections.reverseOrder());
        
        
        for(int i=0;i<happi.length;i++){
            pq.add((long)happi[i]);
        }
        long let=0;
        
    
        long ans=0;
        
        while(pq.size()>0 && k>0){

           ans=ans+ Math.max(pq.poll()-let,0); k=k-1; let=let+1;
            
        }
        
        
        
        
        return ans;
        
    }
}