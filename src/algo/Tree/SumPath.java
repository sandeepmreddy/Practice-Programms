package algo.Tree;

import java.util.LinkedList;

public class SumPath {

    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;

        LinkedList<TreeNode> nodeStack = new LinkedList();
        LinkedList<Integer> sumStack = new LinkedList();
        nodeStack.add(root);
        sumStack.add(sum - root.val);

        TreeNode node;
        int currSum;
        while (!nodeStack.isEmpty()) {
            node = nodeStack.pollLast();
            currSum = sumStack.pollLast();
            if (
                    (node.right == null) && (node.left == null) && (currSum == 0)
            ) return true;

            if (node.right != null) {
                nodeStack.add(node.right);
                sumStack.add(currSum - node.right.val);
            }
            if (node.left != null) {
                nodeStack.add(node.left);
                sumStack.add(currSum - node.left.val);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Example usage
        BinaryTreeInverter inverter = new BinaryTreeInverter();

        // Create a sample binary tree
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        boolean sumPath= hasPathSum(root, 17);
        System.out.println("sumPath: " +sumPath);
    }
}
