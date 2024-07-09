package algo.Tree;

public class LowestCommonAncestor {
    // Function to find the LCA of two nodes in a binary tree
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (true) {
            if (root.val < p.val && root.val < q.val) {
                root = root.right;
            } else if (root.val > p.val && root.val > q.val) {
                root = root.left;
            } else {
                return root;
            }
        }
    }

    public static void main(String[] args) {
        LowestCommonAncestor tree = new LowestCommonAncestor();
    /*

        4
       / \
      2   7
     / \ / \
    1  3 6  9

*/
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        // Find LCA of nodes 2 and 7
        TreeNode lca = tree.lowestCommonAncestor(root, root.left, root.right);
        System.out.println("LCA of node 2 and node 7 is: " + lca.val);

        // Find LCA of nodes 7 and 9
        lca = tree.lowestCommonAncestor(root, root.right, root.right.right);
        System.out.println("LCA of node 7 and node 9 is: " + lca.val);
    }
}

