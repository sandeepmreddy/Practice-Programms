package algo.Tree;

//Time,Space O(n)
//Breath First Search Tree
import java.util.LinkedList;
 import java.util.Queue;

public class BSTLevelTraversal {
    TreeNode root;

    public BSTLevelTraversal() {
        root = null;
    }

    void printLevelOrder() {
        if (root == null)
            return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode tempTreeNode = queue.poll();
            System.out.print(tempTreeNode.val + " ");

            if (tempTreeNode.left != null)
                queue.add(tempTreeNode.left);

            if (tempTreeNode.right != null)
                queue.add(tempTreeNode.right);
        }
    }

    public static void main(String[] args) {
        BSTLevelTraversal tree = new BSTLevelTraversal();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("Level order traversal of binary tree is: ");
        tree.printLevelOrder();
    }
}

