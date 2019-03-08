package LeetCode;

public class DeleteNodeInALinkedList {

    public void deleteNode(ListNode node) {
        ListNode tmp = node;
        tmp.val = tmp.next.val;
        tmp.next = tmp.next.next;
    }
}
