package problems.linkedlist;


class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     ListNode(int val) { this.val = val; }
}

public class ReverseLinkedList {


    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }

    public ListNode reverseListRecursively(ListNode head) {
        if(head == null) return null;

        var newHead = head;

        if(head.next != null) {
            newHead = this.reverseListRecursively(head.next);
            head.next.next = head;
        }
        head.next = null;

        return newHead;
    }
}

















