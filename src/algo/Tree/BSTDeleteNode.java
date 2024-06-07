package algo.Tree;

class TreeNode7 {
    int val;
    TreeNode7 left, right;

    public TreeNode7(int item) {
        val = item;
        left = right = null;
    }
}

public class BSTDeleteNode {
    TreeNode7 root;

    public BSTDeleteNode() {
        root = null;
    }

    // Function to delete a node
    TreeNode7 deleteNode(TreeNode7 root, int key) {
        // Base Case: If the tree is empty
        if (root == null) return root;

        // Otherwise, recur down the tree
        if (key < root.val)
            root.left = deleteNode(root.left, key);
        else if (key > root.val)
            root.right = deleteNode(root.right, key);
        else {
            // Node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.val = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteNode(root.right, root.val);
        }

        return root;
    }

    // Function to find the minimum value node in a given tree
    int minValue(TreeNode7 root) {
        int minValue = root.val;
        while (root.left != null) {
            minValue = root.left.val;
            root = root.left;
        }
        return minValue;
    }

    // Function to insert a new node with given key in BST
    void insert(int key) {
        root = insertRec(root, key);
    }

    // A utility function to insert a new node with given key in BST
    TreeNode7 insertRec(TreeNode7 root, int key) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new TreeNode7(key);
            return root;
        }

        // Otherwise, recur down the tree
        if (key < root.val)
            root.left = insertRec(root.left, key);
        else if (key > root.val)
            root.right = insertRec(root.right, key);

        // return the (unchanged) node pointer
        return root;
    }

    // This method mainly calls deleteNode()
    void deleteKey(int key) {
        root = deleteNode(root, key);
    }

    // A utility function to do inorder traversal of BST
    void inorder() {
        inorderRec(root);
    }

    // A utility function to do inorder traversal of BST
    void inorderRec(TreeNode7 root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.val + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BSTDeleteNode tree = new BSTDeleteNode();

        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal of the given tree");
        tree.inorder();

        System.out.println("\n\nDelete 20");
        tree.deleteKey(20);
        System.out.println("Inorder traversal of the modified tree");
        tree.inorder();

        System.out.println("\n\nDelete 30");
        tree.deleteKey(30);
        System.out.println("Inorder traversal of the modified tree");
        tree.inorder();

        System.out.println("\n\nDelete 50");
        tree.deleteKey(50);
        System.out.println("Inorder traversal of the modified tree");
        tree.inorder();
    }
}
