package algo.Tree;

// Java program to implement optimized delete in BST.
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

class Node {
    int val;
    Node left, right;

    // A utility function to create a new BST node
    Node(int item) {
        val = item;
        left = right = null;
    }
}

class BST {
    Node root;

    // A utility function to do inorder traversal of BST
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    /* A utility function to insert a new node with given val in
     * BST */
    Node insert(Node node, int val) {
        /* If the tree is empty, return a new node */
        if (node == null)
            return new Node(val);

        /* Otherwise, recur down the tree */
        if (val < node.val)
            node.left = insert(node.left, val);
        else if (val > node.val)
            node.right = insert(node.right, val);

        /* return the (unchanged) node pointer */
        return node;
    }

    /* Given a binary search tree and a val, this function
    deletes the val and returns the new root */
    Node deleteNode(Node root, int val) {
        // Base case
        if (root == null)
            return root;

        // node to be deleted
        if (root.val > val) {        // Recursive calls for ancestors of

            root.left = deleteNode(root.left, val);
            return root;
        } else if (root.val < val) {
            root.right = deleteNode(root.right, val);
            return root;
        }

        // We reach here when root is the node
        // to be deleted.

        // If one of the children is empty
        if (root.left == null) {
            Node temp = root.right;
            return temp;
        } else if (root.right == null) {
            Node temp = root.left;
            return temp;
        }

        // If both children exist
        else {

            Node succParent = root;

            // Find successor
            Node succ = root.right;
            while (succ.left != null) {
                succParent = succ;
                succ = succ.left;
            }

            // Delete successor. Since successor
            // is always left child of its parent
            // we can safely make successor's right
            // right child as left of its parent.
            // If there is no succ, then assign
            // succ.right to succParent.right
            if (succParent != root)
                succParent.left = succ.right;
            else
                succParent.right = succ.right;

            // Copy Successor Data to root
            root.val = succ.val;

            // Delete Successor and return root
            return root;
        }
    }

    // Driver Code
    public static void main(String[] args) {
        LocalDate dateWithoutTime = LocalDate.now();
        System.out.println("dateWithoutTime "+dateWithoutTime);
        LocalDateTime localDate = LocalDateTime.from(dateWithoutTime.atStartOfDay(ZoneId.systemDefault()));
        Timestamp timestampWithoutTime = Timestamp.valueOf(localDate);
        System.out.println("timestampWithoutTime "+timestampWithoutTime);
        BST tree = new BST();

		/* Let us create following BST
				50
			/	 \
			30	 70
			/ \ / \
		  20 40 60  */
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 60);

        System.out.print("Original BST: ");
        tree.inorder(tree.root);

        System.out.println("\n\nDelete a Leaf Node: 20");
        tree.root = tree.deleteNode(tree.root, 20);
        System.out.print("Modified BST tree after deleting Leaf Node:\n");
        tree.inorder(tree.root);

        System.out.println("\n\nDelete Node with single child: 70");
        tree.root = tree.deleteNode(tree.root, 70);
        System.out.print("Modified BST tree after deleting single child Node:\n");
        tree.inorder(tree.root);

        System.out.println("\n\nDelete Node with both child: 50");
        tree.root = tree.deleteNode(tree.root, 50);
        System.out.print("Modified BST tree after deleting both child Node:\n");
        tree.inorder(tree.root);
    }
}
