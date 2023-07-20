package Stack;

import java.util.ArrayList;
import java.util.List;

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class n_ary_preorder {
    class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
    public void preorder(Node root, List<Integer> res){

        if(root == null){
            
            return;
        }

        res.add(root.val);

        //put the node in the list from the tree
        for(int i =0;i<root.children.size();i++){
            
            preorder(root.children.get(i),res);
        }
    }
    public List<Integer> preorder(Node root) {
        
        List<Integer> ans = new ArrayList<Integer>();

        preorder(root,ans);

        return ans;
    }
}
