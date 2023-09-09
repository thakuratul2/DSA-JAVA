public class diameter_bt {
    
    //diameter in bt means the longest path btw 2 nodes
    // path does not passes through root

    class TreeNode{
        int left;
        int right;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        height(root, diameter);

        return diameter[0];
    }


    private  static int height(TreeNode root, int[] diameter){

        if(root == null){
            return 0;
        }
        int lh = height(root.left, diameter);
        int rh = height(root.right, diameter);
        diameter[0] = Math.max(diameter[0], lh + rh);

        return 1 + Math.max(lh, rh);
    }
}
