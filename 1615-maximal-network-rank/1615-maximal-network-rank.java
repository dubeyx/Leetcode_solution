class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
            Map<Integer,List<Integer>> mp= new HashMap<>();
        
        
        
        for(int i=0;i<roads.length;i++){
           
            List<Integer> x= (mp.containsKey(roads[i][0])==true)?mp.get(roads[i][0]):new ArrayList<>();
             List<Integer> y= (mp.containsKey(roads[i][1])==true)?mp.get(roads[i][1]):new ArrayList<>();
            x.add(roads[i][1]);
            y.add(roads[i][0]);
            mp.put(roads[i][0],x);
            mp.put(roads[i][1],y);
            
            
            
        }
        
     //   System.out.println(mp);
        
        int ans=0;
        
        for(int i=0;i<n;i++){
            
            for(int j=i+1;j<n;j++){
                
                List<Integer> l=mp.get(i);
                
                if(mp.containsKey(i)==false || mp.containsKey(j)==false) continue;
                
                
                if(l.contains(i) || l.contains(j)){
                    ans=Math.max(ans,mp.get(i).size()+mp.get(j).size()-1);
                }else{
                    ans=Math.max(ans,mp.get(i).size()+mp.get(j).size());
                }
                
                
                
            }
            
            
        }
        
        
        
        
        
        
        
        
        return ans;
        
    }
}