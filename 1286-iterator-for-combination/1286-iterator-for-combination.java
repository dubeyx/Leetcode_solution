class CombinationIterator {

    public void get(String s, String gt, int k, int i){
        
        if(i>=s.length()){
            
            if(gt.length()==k) ans.add(gt);
            return;
        }
        
        if(gt.length()==k) {ans.add(gt);return;}
        
        
         get(s,gt,k,i+1);
        get(s,gt+s.charAt(i),k,i+1);
        
        
        
        
    }
    
    
    StringBuilder sb ;
    int comb=0;
    List<String> ans= new ArrayList<>();
    public CombinationIterator(String characters, int combinationLength) {
       
        get(characters,"",combinationLength,0);
Collections.sort(ans);
        
        
    }
    
    public String next() {
        
        return ans.get(comb++);
       
        
    }
    
    public boolean hasNext() {
        
        if(comb>=ans.size()) return false;
        return true;
        
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */