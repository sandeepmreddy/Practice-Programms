package algo.Tree;

//Time Complexity O(n)
//Space Complexity O(n) --This is tree height

public class BinaryTreeInverter {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        // Recursively invert the left and right subtrees
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        // Swap the left and right children
        root.left = right;
        root.right = left;
        return root;
    }
    /*    4
         / \
        2   7
       / \ / \
      1  3 6  9

        4
       / \
      7   2
     / \ / \
    9  6 3  1*/
    // Helper method to print the tree inorder
    public void printInorder(TreeNode node) {
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
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        System.out.println("Original tree:");
        inverter.printInorder(root);
        System.out.println();

        // Invert the binary tree
        TreeNode invertedRoot = inverter.invertTree(root);

        System.out.println("Inverted tree:");
        inverter.printInorder(invertedRoot);
    }
}
