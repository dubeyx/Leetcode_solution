class Solution {
    public List<String> summaryRanges(int[] nums) {
         List<String> a = new ArrayList();
        if(nums.length==0)
        {
            
            
            return a;
            
        }
        else if(nums.length==1)
        {
            
            a.add(""+nums[0]);
            
            return a;
            
        }
       
        int in=nums[0];
        int fin=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            
            if(nums[i]==nums[i-1]+1)
            {
                 fin=nums[i];
                
               
            }
            else
            {
                if(in>=fin )
                a.add(""+in);
                else if(in<fin)
                    a.add(""+ in+"->"+fin);
                
                
                
                
                in=nums[i];
                
                
                
            }
            
            
            
            
            
        }
        if(fin>=in)
        {
        
        if(in==fin)
                a.add(""+in);
                else
                    a.add(""+ in+"->"+fin);}
        else
        {
            a.add(""+in);
        }
        
        
        
        return a;
        
    }
}