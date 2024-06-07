package algo.Tree;

//Time,Space O(n)
import java.util.LinkedList;
        import java.util.Queue;

class Node2 {
    int data;
    Node2 left, right;

    public Node2(int item) {
        data = item;
        left = right = null;
    }
}

public class BSTLevelTraversal {
    Node2 root;

    public BSTLevelTraversal() {
        root = null;
    }

    void printLevelOrder() {
        if (root == null)
            return;

        Queue<Node2> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node2 tempNode2 = queue.poll();
            System.out.print(tempNode2.data + " ");

            if (tempNode2.left != null)
                queue.add(tempNode2.left);

            if (tempNode2.right != null)
                queue.add(tempNode2.right);
        }
    }

    public static void main(String[] args) {
        BSTLevelTraversal tree = new BSTLevelTraversal();
        tree.root = new Node2(1);
        tree.root.left = new Node2(2);
        tree.root.right = new Node2(3);
        tree.root.left.left = new Node2(4);
        tree.root.left.right = new Node2(5);

        System.out.println("Level order traversal of binary tree is: ");
        tree.printLevelOrder();
    }
}

