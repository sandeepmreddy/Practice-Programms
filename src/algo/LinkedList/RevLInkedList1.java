package algo.LinkedList;
//Iterative approach: O(n) time, O(1) space.
public class RevLInkedList1 {
    Node head;

    // Function to reverse the linked list
    public Node reverse(Node head) {
        Node prev = null;  // Previous node starts as null
        Node curr = head;  // Current node starts as head
        Node next = null;  // Next node starts as null

        while (curr != null) {
            next = curr.next;   // Store the next node
            curr.next = prev;   // Reverse the current node's pointer
            prev = curr;        // Move prev to current node
            curr = next;        // Move curr to the next node
        }
        return prev;  // New head of the reversed list
    }

    // Function to print the linked list
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RevLInkedList1 list = new RevLInkedList1();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        list.printList(list.head);

        // Reverse the list
        list.head = list.reverse(list.head);

        System.out.println("Reversed List:");
        list.printList(list.head);
    }
}
