package algo.Tree;

class TreeNode {
    TreeNode5 left;
    TreeNode5 right;
    int val;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    TreeNode5 root;

    void insert(int val) {
        this.root = insertNode(root, val);
    }

    TreeNode5 insertNode(TreeNode5 node, int val) {
        if (node == null) {
            return new TreeNode5(val);
        } else if (val < node.val) {
            node.left = insertNode(node.left, val);
        } else {
            node.right = insertNode(node.right, val);
        }
        return node;
    }

    private static void inOrderTraversal(TreeNode5 node) {
        if (node == null) {
            return;
        }

        inOrderTraversal(node.left);
        System.out.print(" " + node.val + " ");
        inOrderTraversal(node.right);


    }

    private int maxDepth(TreeNode5 node) {
        int val1 = 0;
        if (node == null) {
            return 0;
        } else {
            int left = maxDepth(node.left);
            int right = maxDepth(node.right);
            val1 = Math.max(left, right) + 1;
        }
        return val1;
    }

    private static boolean isSameTree(TreeNode5 node1, TreeNode5 node2) {
        if (node1 == null && node2 == null) {
            return true;

        } else if (node1 == null || node2 == null) {
            return false;
        } else if (node1.val != node2.val) {
            return false;
        } else {
            return isSameTree(node1.left, node2.left)
                    && isSameTree(node1.right, node2.right);
        }

    }

    private static int countNodes(TreeNode5 node) {
        int count=0;
        if(node!=null) {
            count =count+countNodes(node.left)+1;
            count =count+countNodes(node.right);
        }
        return count;
    }


    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(10);
        binaryTree.insert(5);
        binaryTree.insert(3);
        binaryTree.insert(2);
        binaryTree.insert(12);
        binaryTree.insert(11);

        BinaryTree binaryTree1 = new BinaryTree();
        binaryTree1.insert(10);
        binaryTree1.insert(5);
        binaryTree1.insert(3);
        binaryTree1.insert(2);
        binaryTree1.insert(12);
        binaryTree1.insert(11);


        inOrderTraversal(binaryTree.root);
       int depth = binaryTree.maxDepth(binaryTree.root);
        System.out.println("depth " +depth);

        boolean isSameTree = isSameTree(binaryTree.root, binaryTree1.root);
        System.out.println("isSameTree " + isSameTree);

        int count= binaryTree.countNodes(binaryTree.root);
        System.out.println("count "+count);


    }

}