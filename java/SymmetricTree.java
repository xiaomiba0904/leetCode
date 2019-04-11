package LeetCode;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        try {
            checkSymmetric(root.left, root.right);
        } catch (NotSymmetricException e) {
            return false;
        }
        return true;
    }

    class NotSymmetricException extends Exception {}

    private void checkSymmetric(TreeNode x, TreeNode y) throws NotSymmetricException{
        if (x == null || y == null) {
            if (x == y) {
                return;
            }else {
                throw new NotSymmetricException();
            }
        }
        if (x.val != y.val) {
            throw new NotSymmetricException();
        }

        checkSymmetric(x.left, y.right);
        checkSymmetric(x.right, y.left);
    }
}
