package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KthSmallestElementInAbst {


    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        search(root, list);
        Integer[] result = new Integer[list.size()];
        list.toArray(result);
        Arrays.sort(result);
        return result[k];
    }

    private void search(TreeNode node, List<Integer> list) {
        list.add(node.val);
        if (node.left != null) {
            search(node.left, list);
        }
        if (node.right != null) {
            search(node.right, list);
        }
    }

    private int count=0;
    private int res=0;
    public int kthSmallest2(TreeNode root, int k) {
        inOrder(root,k);
        return res;
    }
    private void inOrder(TreeNode root, int k){
        if(root==null){
            return;
        }
        if(res!=0) return;
        inOrder(root.left,k);
        count++;
        if(count==k){
            res=root.val;
        }
        inOrder(root.right,k);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode thisNode = root;
        thisNode.left = new TreeNode(1);
        thisNode.right = new TreeNode(4);
        thisNode.left.right = new TreeNode(2);
        KthSmallestElementInAbst kth = new KthSmallestElementInAbst();
        System.out.println(kth.kthSmallest2(root, 2));
    }
}
