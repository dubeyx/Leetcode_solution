/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public int getMinimumDifference(TreeNode root) {
        int min=Integer.MAX_VALUE;
        ArrayList<Integer> a = new ArrayList();
        
        help(root,a);
        for(int i=0;i<a.size()-1;i++)
        {
            
           min= Math.min(min,Math.abs(a.get(i)-a.get(i+1)));
            
        }
        
        return min;
      
    }
    
    public void help(TreeNode r, ArrayList<Integer> a)
    {
        if(r==null) return ;
        help(r.left,a);
        a.add(r.val);
        help(r.right,a);
        
        return;
        
    }
}