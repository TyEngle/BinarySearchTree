public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
            value = x;
        }
    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
    public TreeNode() {
    }
    public TreeNode(int value, int i, int i1) {
    }
    public int getvalue() {
        return value;
    }
    public void setvalue(int value) {
        this.value = value;
    }
    public TreeNode getLeft() {
        return left;
    }
    public void setLeft(TreeNode left) {
        this.left = left;
    }
    public TreeNode getRight() {
        return right;
    }
    public void setRight(TreeNode right) {
        this.right = right;
    }
    @Override
    public String toString() {
        return "TreeNode{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
    }