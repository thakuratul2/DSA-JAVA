package Stack;

import java.util.ArrayList;
import java.util.List;

import java.util.Stack;

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
class binary_preoder {
    public class TreeNode {
        int val;
          TreeNode left;
          TreeNode right;
           TreeNode() {}
           TreeNode(int val) { this.val = val; }
           TreeNode(int val, TreeNode left, TreeNode right) {
               this.val = val;
               this.left = left;
               this.right = right;
        }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder = new ArrayList<Integer>();

        //base case
        if(root == null){
            return preorder;
        }

        Stack<TreeNode> stk = new Stack<TreeNode>();

        //push the root value
        stk.push(root);

        while(!stk.isEmpty()){
            //remove first root value
            root = stk.pop();
            preorder.add(root.val);//add the value of tree in list

            //add node from right

            if(root.right!=null){
                stk.push(root.right);
            }

            //add node from left
            if(root.left!=null){
                stk.push(root.left);
            }
        }

        return preorder;
    }
}
