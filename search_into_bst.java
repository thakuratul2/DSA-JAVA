public class search_into_bst {
    
    class TreeNode{

        public int val;
        public search_into_bst.TreeNode left;
         public search_into_bst.TreeNode right;
    }
        
        //search the number and return subtree
        public TreeNode searchBST(TreeNode root, int val) {
            if(root == null){
                return null;
            }
    
            if(root.val == val){
                return root;
            }
    
            if(val < root.val){
                return searchBST(root.left,val);
            }else{
                return searchBST(root.right,val);
            }
        }
    }
