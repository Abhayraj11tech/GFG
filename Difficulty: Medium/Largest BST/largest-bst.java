class Solution {

    static class Info {
        boolean isValid;
        int size;
        int min;
        int max;

        Info(boolean isValid, int size, int min, int max) {
            this.isValid = isValid;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    static int maxSize;

    static int largestBst(Node root) {
        maxSize = 0;
        helper(root);
        return maxSize;
    }

    static Info helper(Node node) {
        if (node == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Info left = helper(node.left);
        Info right = helper(node.right);

        if (left.isValid && right.isValid && node.data > left.max && node.data < right.min) {
            int size = left.size + right.size + 1;
            maxSize = Math.max(maxSize, size);
            int min = Math.min(node.data, left.min);
            int max = Math.max(node.data, right.max);
            return new Info(true, size, min, max);
        }

        return new Info(false, 0, 0, 0);
    }
}
