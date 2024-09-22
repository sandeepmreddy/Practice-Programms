package Practice;

import algo.LinkedList.*;

public class RevLinkedList {
  public Node head = null;

  public Node reverseList(Node head)
  {
      Node prev = null;
      Node curr = head;
      Node next = null;

      while(curr != null)
      {
          next= curr.next;
          curr.next = prev;
          prev = curr;
          curr= next;
      }

      return prev;
  }

  public void printNode(Node head)
  {
      Node temp =head;
      while(temp != null)
      {
          System.out.println(" "+temp.value+" ");
          temp= temp.next;
      }
  }

    public static void main(String[]  args)
    {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        RevLinkedList list = new RevLinkedList();
        list.head=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next = node4;
        node4.next =node5;

        Node rev =list.reverseList(node1);
        list.printNode(rev);
    }
}
