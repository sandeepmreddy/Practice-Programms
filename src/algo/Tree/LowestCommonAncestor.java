package algo.Tree;

public class LowestCommonAncestor {
    // Function to find the LCA of two nodes in a binary tree
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case
        if (root == null || root == p || root == q) {
            return root;
        }

        // Recur for left and right subtrees
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // If both left and right are non-null, p and q are found in different subtrees
        if (left != null && right != null) {
            return root;
        }

        // If left or right is non-null, LCA is found in that subtree
        return (left != null) ? left : right;
    }

    public static void main(String[] args) {
        LowestCommonAncestor tree = new LowestCommonAncestor();

        // Construct the binary tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        // Find LCA of nodes 5 and 1
        TreeNode lca = tree.lowestCommonAncestor(root, root.left, root.right);
        System.out.println("LCA of node 5 and node 1 is: " + lca.val);

        // Find LCA of nodes 5 and 4
        lca = tree.lowestCommonAncestor(root, root.left, root.left.right.right);
        System.out.println("LCA of node 5 and node 4 is: " + lca.val);
    }
}

