package LeetCode;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return depth(root, 1);

    }

    private int depth(TreeNode node, int d) {
        if (node.left == null && node.right == null) {
            return d;
        }

        int left_d = 0;
        int right_d = 0;
        if (node.left != null) {
            left_d = depth(node.left, d+1);
        }

        if (node.right != null) {
            right_d = depth(node.right, d+1);
        }

        return left_d >= right_d ? left_d : right_d;
        
    }


    public int maxDepthBest(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepthBest(root.left), maxDepthBest(root.right)) + 1;
    }

}
