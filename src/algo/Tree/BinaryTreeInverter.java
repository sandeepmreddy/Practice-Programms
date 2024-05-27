package algo.Tree;

//Time Complexity O(n)
//Space Complexity O(n) --This is tree height

class TreeNode6 {
    int val;
    TreeNode6 left;
    TreeNode6 right;

    TreeNode6(int x) {
        val = x;
    }
}

public class BinaryTreeInverter {
    public TreeNode6 invertTree(TreeNode6 root) {
        if (root == null) {
            return null;
        }
        TreeNode6 right = invertTree(root.right);
        TreeNode6 left = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }

    // Helper method to print the tree inorder
    public void printInorder(TreeNode6 node) {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.val + " ");
        printInorder(node.right);
    }

    public static void main(String[] args) {
        // Example usage
        BinaryTreeInverter inverter = new BinaryTreeInverter();

        // Create a sample binary tree
        TreeNode6 root = new TreeNode6(4);
        root.left = new TreeNode6(2);
        root.right = new TreeNode6(7);
        root.left.left = new TreeNode6(1);
        root.left.right = new TreeNode6(3);
        root.right.left = new TreeNode6(6);
        root.right.right = new TreeNode6(9);

        System.out.println("Original tree:");
        inverter.printInorder(root);
        System.out.println();

        // Invert the binary tree
        TreeNode6 invertedRoot = inverter.invertTree(root);

        System.out.println("Inverted tree:");
        inverter.printInorder(invertedRoot);
    }
}
