class Solution {
  
    int val;
    int height;
    public int findBottomLeftValue(TreeNode root) {
        height=-1;
        val=-1;
        
        helper(root,0);
        
        
        return val;
        
    }
    
    public void helper(TreeNode root,int h){
        
        if(root==null) return;
        if(height<h){
            height=h;
            val=root.val;
        }
        
        
        helper(root.left,h+1);
        helper(root.right,h+1);
        
        
        
    }
}