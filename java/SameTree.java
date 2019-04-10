package LeetCode;

public class SameTree {

    class NotSameException extends Exception {}

    public boolean isSameTree(TreeNode p, TreeNode q) {
        try {
            isSame(p, q);
        } catch (NotSameException e) {
            return false;
        }
        return true;
    }

    private void isSame(TreeNode x, TreeNode y) throws NotSameException{
        if (x == null || y == null) {
            if (x == y) {
                return;
            }else {
                throw new NotSameException();
            }
        }


        if (x.val != y.val) {
            throw new NotSameException();
        }

        isSame(x.left, y.left);
        isSame(x.right, y.right);
    }
    
}
