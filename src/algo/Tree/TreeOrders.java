package algo.Tree;

public class TreeOrders {
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
