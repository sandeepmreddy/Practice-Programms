package algo.Tree;

class TreeNode5 {
    int val;
    TreeNode5 left;
    TreeNode5 right;

    TreeNode5(int x) {
        val = x;
    }
}

public class DeleteTreeNode {
    TreeNode5 root;

    public DeleteTreeNode() {
        root = null;
    }

    // Function to insert a new node in the binary tree
    public void insert(int value) {
        root = insertRec(root, value);
    }

    private TreeNode5 insertRec(TreeNode5 root, int value) {
        if (root == null) {
            root = new TreeNode5(value);
            return root;
        }

        if (value < root.val)
            root.left = insertRec(root.left, value);
        else if (value > root.val)
            root.right = insertRec(root.right, value);

        return root;
    }

    // Function to replace a node with null if its value matches the given value
    public void replaceWithValueNull(int value) {
        root = replaceWithValueNullRec(root, value);
    }

    private TreeNode5 replaceWithValueNullRec(TreeNode5 root, int value) {
        if (root == null)
            return null;

        if (root.val == value) {
            root.val = 0;
            //return root;
        }

        root.left = replaceWithValueNullRec(root.left, value);
        root.right = replaceWithValueNullRec(root.right, value);

        return root;
    }

    // Function to print the binary tree (inorder traversal)
    public void inorderTraversal(TreeNode5 root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        DeleteTreeNode tree = new DeleteTreeNode();
        int[] values = {10, 5, 8, 4, 7, 12, 15};

        // Inserting nodes into the binary tree
        for (int value : values) {
            tree.insert(value);
        }

        System.out.println("Binary Tree before replacement:");
        tree.inorderTraversal(tree.root);
        System.out.println();

        // Replacing node with value 5 with null
        tree.replaceWithValueNull(5);
        tree.replaceWithValueNull(12);

        System.out.println("Binary Tree after replacing node with value 5 with null:");
        tree.inorderTraversal(tree.root);
    }
}
