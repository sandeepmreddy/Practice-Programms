package algo;

/*

Pre-order traversal: In this method, you visit the root node first, then traverse the left subtree, followed by the right subtree. This is often used when you need to perform some operation on each node in the tree, and the order of visiting the nodes matters.

In-order traversal: In this method, you visit the left subtree first, then the root node, and then the right subtree. This is often used when you need to visit the nodes in sorted order, such as in a binary search tree.

Post-order traversal: In this method, you visit the left subtree first, then the right subtree, and finally the root node. This is often used when you need to perform some operation on each node in the tree, and the order of visiting the nodes does not matter.

*/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class TreeProgram {
    public static void main(String[] args) {
        // Creating a binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Traverse the binary tree in pre-order
        System.out.println("Preorder traversal of binary tree is:");
        preOrder(root);

        // Traverse the binary tree in in-order
        System.out.println("Inorder traversal of binary tree is:");
        inOrder(root);

        // Traverse the binary tree in post-order
        System.out.println("Postorder traversal of binary tree is:");
        postOrder(root);
    }

    // Preorder traversal of binary tree
    public static void preOrder(TreeNode node) {
        if (node == null) return;
        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // Inorder traversal of binary tree
    public static void inOrder(TreeNode node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }

    // Postorder traversal of binary tree
    public static void postOrder(TreeNode node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val + " ");
    }
}
