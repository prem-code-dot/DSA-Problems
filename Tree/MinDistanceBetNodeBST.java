class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class MinDistanceBetNodeBST {
    private int minDiff = Integer.MAX_VALUE;
    private TreeNode prevNode; //to keep track of just prev node

    public int minDiffInBST(TreeNode root) {
        inOrderTraversal(root);
        return minDiff;
    }

    private void inOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }

        inOrderTraversal(node.left);

        if (prevNode != null) {
            minDiff = Math.min(minDiff, node.val - prevNode.val);
        }

        prevNode = node;

        inOrderTraversal(node.right);
    }

    public static void main(String[] args) {
        // Example usage:
        MinDistanceBetNodeBST solution = new MinDistanceBetNodeBST();

        // Example 1:
        TreeNode root1 = new TreeNode(4);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(6);
        root1.left.left = new TreeNode(1);
        root1.left.right = new TreeNode(3);

        System.out.println(solution.minDiffInBST(root1));  // Output: 1

        // Example 2:
        TreeNode root2 = new TreeNode(1);
        root2.right = new TreeNode(48);
        root2.right.left = new TreeNode(12);
        root2.right.right = new TreeNode(49);

        System.out.println(solution.minDiffInBST(root2));  // Output: 1
    }
}
