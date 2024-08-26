package algo.Tree;

class BinaryTreeExamples {
    TreeNode root;

    void insert(int val) {
        this.root = insertNode(root, val);
    }

    TreeNode insertNode(TreeNode node, int val) {
        if (node == null) {
            return new TreeNode(val);
        } else if (val < node.val) {
            node.left = insertNode(node.left, val);
        } else {
            node.right = insertNode(node.right, val);
        }
        return node;
    }
// Left,Root, Right
    private static void inOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }

        inOrderTraversal(node.left);
        System.out.print(" " + node.val + " ");
        inOrderTraversal(node.right);


    }

    private int maxDepth(TreeNode node) {
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

    private static boolean isSameTree(TreeNode node1, TreeNode node2) {
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

    private static int countNodes(TreeNode node) {
        int count=0;
        if(node!=null) {
            count =count+countNodes(node.left);
            count = count+1;
            count =count+countNodes(node.right);
        }
        return count;
    }


    public static void main(String[] args) {
        BinaryTreeExamples binaryTree = new BinaryTreeExamples();
        binaryTree.insert(10);
        binaryTree.insert(5);
        binaryTree.insert(3);
        binaryTree.insert(2);
        binaryTree.insert(12);
        binaryTree.insert(11);

        BinaryTreeExamples binaryTree1 = new BinaryTreeExamples();
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