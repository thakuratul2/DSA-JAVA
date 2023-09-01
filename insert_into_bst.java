public class insert_into_bst {

    class TreeNode{

        public int val;
        public int left;
        public int right;
        
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            //it return the value when the root is null
            root = new TreeNode();//TreeNode(val)
            return root;
        } 
      
 
        if(val < root.val){
            root.left = insertIntoBST(root.left,val);
        }else{
            root.right = insertIntoBST(root.right,val);
        }
 
        return root;
     }
}
