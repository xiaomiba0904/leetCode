package LeetCode;


public class LowestCommonAncestorOfABinarySearchTree {
    TreeNode res = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        lca(root, p , q);
        return res;
    }

    public void lca(TreeNode root, TreeNode p , TreeNode q){
        if((root.val - p.val)*(root.val - q.val) <= 0){
            // 小于零表示值在二叉树的2边
            res = root;
        }else if(root.val < p.val && root.val < q.val){
            lca(root.right, p , q);
        }else{
            lca(root.left, p , q);
        }
    }
}
