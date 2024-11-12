package algo.Tree;
// Time Complexity o(n), Space Complexity o(n)
import java.util.Stack;

public class SumPath {

    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;

        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<Integer> sumStack = new Stack<>();
        nodeStack.push(root);
        sumStack.push(sum - root.val);

        TreeNode node;
        int currSum;
        while (!nodeStack.isEmpty()) {
            node = nodeStack.pop();
            currSum = sumStack.pop();
            if ((node.right == null) && (node.left == null) && (currSum == 0))
                return true;

            if (node.right != null) {
                nodeStack.push(node.right);
                sumStack.push(currSum - node.right.val);
            }
            if (node.left != null) {
                nodeStack.push(node.left);
                sumStack.push(currSum - node.left.val);
            }
        }
        return false;
    }
 /*                4
                  / \
                 2   7
                / \ / \
               1  3 6  9*/



    public static void main(String[] args) {
        // Example usage

        // Create a sample binary tree
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        boolean sumPath = hasPathSum(root, 9);
        System.out.println("sumPath: " + sumPath);
    }
}
