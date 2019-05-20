package LeetCode;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(0);
        ListNode head1 = node1;
        ListNode head2 = node2;

        while(head != null) {
            if (head.val < x) {
                node1.next = head;
                node1 = node1.next;
            }else {
                node2.next = head;
                node2 = node2.next;
            }
            head = head.next;
        }
        node1.next = head2.next;
        node2.next = null;
        return head1.next;
    }
}
