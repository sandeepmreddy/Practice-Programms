package Practice;

class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;

    public TreeNode1(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    TreeNode1 root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int val) {
        this.root = insertNode(this.root, val);
    }

    private TreeNode1 insertNode(TreeNode1 node, int val) {
        if (node == null) {
            return new TreeNode1(node.val);
        }
        if (node.val < val) {
            node.left = insertNode(node.left, val);
        } else if (node.val > val) {
            node.right = insertNode(node.right, val);
        }
        return node;
    }

    public void inorderTraversal(TreeNode1 node) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.val + " ");
        inorderTraversal(node.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
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

