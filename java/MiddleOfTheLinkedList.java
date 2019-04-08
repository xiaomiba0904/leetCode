package LeetCode;

public class MiddleOfTheLinkedList {
    /**
     * 快慢指针
     * @param head
     * @return
     */
    public ListNode middleNode(ListNode head) {
        ListNode fast, slow;
        slow = head;
        fast = head;

        for(;;) {
            if (fast == null) {
                return slow;
            }

            if(fast.next == null) {
                return slow;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

    }
}
