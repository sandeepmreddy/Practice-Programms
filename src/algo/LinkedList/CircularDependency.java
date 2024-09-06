//Time Complexity: O(n), Space Complexity: O(1)

package algo.LinkedList;

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Function to detect if there is a cycle in the linked list
    public boolean hasCycle() {
        Node slowPointer = head;
        Node fastPointer = head;

        while (slowPointer != null && fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;          // Move by one step
            fastPointer = fastPointer.next.next;     // Move by two steps

            // If slowPointer and fastPointer meet, there is a cycle
            if(slowPointer.value == fastPointer.value)
                return true;
            }
        return false;  // No cycle found
    }
}

public class CircularDependency {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Creating nodes
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        // Linking nodes
        list.head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Creating a cycle: 5th node points to the 2nd node
        fifth.next = second;

        // Checking for a cycle in the list
        if (list.hasCycle()) {
            System.out.println("LinkedList has a cycle.");
        } else {
            System.out.println("No cycle in the LinkedList.");
        }
    }
}
