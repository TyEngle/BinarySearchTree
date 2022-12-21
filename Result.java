public class Result {
    public Result(){}

    public TreeNode sortedArrayToTree(Integer[] integers){
        if(integers.length == 0) return null;
        return constructTreeFromArray(integers, 0, integers.length-1);
    }
//get the middle element(midpoint) and return it
//first we do recursive calls which sets our left boundary
//as well as our right boundary
    public TreeNode constructTreeFromArray(Integer[] integers, int left, int right){
        if (left > right) return null;
        int midpoint = left + (right-left) / 2;
        TreeNode node = new TreeNode(integers[midpoint]);
        node.left = constructTreeFromArray(integers, left, midpoint-1);
        node.right = constructTreeFromArray(integers, midpoint+1, right);

        return node;
    };

    @Override
    public String toString() {
    return "Solution{}";
}
}
