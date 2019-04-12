package LeetCode;

public class MinimumDepthOfBinaryTree {

    private int min = Integer.MAX_VALUE;

    private void setMin(int value) {
        if (value <= this.min) {
            this.min = value;
        }
    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        depth(root, 1);
        return min;
    }

    private void depth(TreeNode node, int d) {
        if (node.left == null & node.right == null) {
            setMin(d);
        }

        if (node.left != null) {
            depth(node.left, d+1);
        }

        if (node.right != null) {
            depth(node.right, d+1);
        }

    }
}
