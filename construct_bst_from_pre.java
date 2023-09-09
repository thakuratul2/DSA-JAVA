public class construct_bst_from_pre {

    class TreeNode{

        public construct_bst_from_pre.TreeNode left;
        public construct_bst_from_pre.TreeNode right;
        public int val;

        public TreeNode(int i) {
        }
       
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        return constructBST(preorder,Integer.MAX_VALUE,new int[]{0});
    }
    public TreeNode constructBST(int[] preorder,int bound,int[]i) {
        if(i[0]==preorder.length ||preorder[i[0]]>bound) return null;
        TreeNode root=new TreeNode(preorder[i[0]++]);
        root.left=constructBST(preorder,root.val,i);
        root.right=constructBST(preorder,bound,i);
        return root;
    }

}
