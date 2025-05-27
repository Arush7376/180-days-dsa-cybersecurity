class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextTemp = current.next; // store next
            current.next = prev;              // reverse
            prev = current;                   // move prev
            current = nextTemp;               // move current
        }

        return prev; // new head
    }

    public static void main(String[] args) {
        // Test Example: 1 -> 2 -> 3 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        ReverseLinkedList rll = new ReverseLinkedList();
        ListNode reversed = rll.reverseList(head);

        while (reversed != null) {
            System.out.print(reversed.val + " -> ");
            reversed = reversed.next;
        }
        System.out.print("null");
    }
}
