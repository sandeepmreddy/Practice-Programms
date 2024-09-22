package algo.LinkedList;

class ListNode
{
    int val;
    ListNode next;
    ListNode(int val)
    {

    }
    ListNode(int val,ListNode next)
    {
        this.val=val;
        this.next =next;
    }

}

public class MergeTwoSortedLists {

    public static ListNode mergeSortedLists(ListNode l1, ListNode l2)
    {
        ListNode head = new ListNode(-1);
        ListNode tail = head;
        while(l1!=null && l2!=null)
        {
            if(l1.val<l2.val)
            {
                tail.next=l1;
                l1=l1.next;
            }else
            {
                tail.next=l2;
                l2=l2.next;
            }
            tail=tail.next;
        }

        tail.next =l1==null?l2:l1;

        return head.next;
    }
    public static void main(String[] args)
    {
        MergeTwoSortedLists p= new MergeTwoSortedLists();
        ListNode l1 = new ListNode(2,new ListNode(3,new ListNode(4)));
        ListNode l2 = new ListNode(1,new ListNode(12,new ListNode(13)));
        ListNode result= mergeSortedLists(l1,l2);
        System.out.println("result "+result);

    }

}
