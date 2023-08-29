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
class valid_binary {
    
public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

}

    public static boolean isValid(TreeNode root, TreeNode min, TreeNode max){

        if(root == null)
        {
return true;
        }
        

        if(min !=  null && root.val<=min.val)
        {
return false;
        }
        if(max !=  null && root.val>=max.val){
            return false;
        }

        return isValid(root.left,min,root) && isValid(root.right,root,max);
        
    }
    public boolean isValidBST(TreeNode root) {

        if(isValid(root,null,null)){
            return true;
        }else{
            return false;
        }
        
    }
}