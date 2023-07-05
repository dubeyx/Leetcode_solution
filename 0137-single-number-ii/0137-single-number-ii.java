class Solution {
    public int singleNumber(int[] nums) {
        int ones=0;
        int twos=0;
        
        for(int num:nums){
            ones=(~twos)&(ones^num);
            twos=(~ones)&(twos^num);
        }
        
        return ones;
    }
}