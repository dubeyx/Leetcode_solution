class Solution {
    public long maxStrength(int[] nums) {
        if(nums.length==1) return nums[0];
        
        List<Integer> l= new ArrayList<>();
        int zero=0;
        long ans=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0) l.add(nums[i]);
           else if(nums[i]>0)
                ans=ans*nums[i];
            else zero++;
        }
        if(zero==nums.length) return 0;
        if(zero==nums.length-1 && l.size()==1) return 0;
        
        
        long z =getMax(l);
       // System.out.println(z + "-" + ans);
        
        
        return Math.max(ans,ans*z);
   
    }
    
    
    public long getMax(List<Integer> l){
        if(l.size()==0) return 1;
    
        if(l.size()==1) return l.get(0);
       
        
        Collections.sort(l);
        // System.out.println(l);
         long mx=l.get(0);
        
        for(int i=1;i<l.size()-1;i++){
            
             mx=mx*l.get(i);
            
            
        }
        
        
        
        
       return Math.max(l.get(l.size()-1),Math.max(mx,mx*l.get(l.size()-1))); 
    }
}