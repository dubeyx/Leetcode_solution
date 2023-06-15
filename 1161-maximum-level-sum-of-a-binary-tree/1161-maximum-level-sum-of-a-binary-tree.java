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
    public int maxLevelSum(TreeNode root) {
        
        PriorityQueue<int[]> x= new PriorityQueue<>( (a,b)->(b[0]-a[0]));
        Queue<TreeNode> q = new LinkedList<>();
        
        TreeNode d = new TreeNode(-1000000);
        q.add(root);
        q.add(d);
        int y=1;
        while(!q.isEmpty())
        {
            
         
            int sum=0;
            while(q.peek().val!=-1000000)
            {
                TreeNode g = q.remove();
                sum=sum+g.val;
                if(g.left!=null) q.add(g.left);
                if(g.right!=null) q.add(g.right);
                
                
            }
            x.add( new int[]{sum,y});
            y++;
            q.remove();
            q.add(d);
            if(q.size()==1) q.remove();
            
            
            
            
            
            
            
        }
        
        
        
        
        
        
        
        
       return x.poll()[1]; 
        
        
        
    }
}