/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node left,right;

    Node(int key)
    {
        data = key;
        left = right = null;
    }
}

*/class Solution {
    public static int isSumProperty(Node root) {
        if (root == null || (root.left == null && root.right == null)) {
            return 1;
        }

        int leftData = (root.left != null) ? root.left.data : 0;
        int rightData = (root.right != null) ? root.right.data : 0;

        if (root.data == leftData + rightData && isSumProperty(root.left) == 1 && isSumProperty(root.right) == 1) {
            return 1;
        }

        return 0;
    }
}
