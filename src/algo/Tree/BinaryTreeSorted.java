package algo.Tree;

class BinaryTreeSorted {
    TreeNode root;

    public BinaryTreeSorted() {
        this.root = null;
    }

    public void insert(int val) {
        this.root = insertNode(this.root, val);
    }

    private TreeNode insertNode(TreeNode node, int val) {
        if (node == null) {
            return new TreeNode(val);
        } else if (val < node.val) {
            node.left = insertNode(node.left, val);
        } else if (val > node.val) {
            node.right = insertNode(node.right, val);
        }
        return node;
    }

    public void inorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.val + " ");
        inorderTraversal(node.right);
    }

    public static void main(String[] args) {
        BinaryTreeSorted tree = new BinaryTreeSorted();
        tree.insert(10);
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(1);
        tree.insert(9);
        tree.insert(12);
        tree.insert(11);
        tree.inorderTraversal(tree.root);
    }
}

