//package algo.Tree;
//
//import java.util.List;
//
//class TreeNode5 {
//    int val;
//    TreeNode5 left;
//    TreeNode5 right;
//
//    TreeNode5(int val) {
//        this.val = val;
//        this.left = null;
//        this.right = null;
//    }
//}
//
//
//public class BinaryTreeDelete {
//    public static void main (String[] args) {
//
//        TreeNode5 root = new TreeNode5(1);
//         root.left = new TreeNode5(2);
//        root.right = new TreeNode5(3);
//        System.out.println("inorder" );
//        inOrder(root);
//
//        System.out.println("preorder" );
//        preOrder(root);
//
//    }
//    // Inorder traversal of binary tree
//    public static void inOrder(TreeNode5 node) {
//        if (node == null) return;
//        inOrder(node.left);
//        System.out.print(node.val + " ");
//        inOrder(node.right);
//    }
//    public static void preOrder(TreeNode2 node) {
//        if (node == null) return;
//        System.out.print(node.val + " ");
//        preOrder(node.left);
//        preOrder(node.right);
//    }
//
//
//
//
//}
