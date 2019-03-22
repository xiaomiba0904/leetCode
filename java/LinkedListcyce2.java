package LeetCode;


public class LinkedListcyce2 {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode meet = null;

        fast = fast.next != null ? fast.next.next : null;
        slow = slow.next;
        while (fast != null) {
            if (fast == slow) {
                meet = slow;
                break;
            }
            fast = fast.next != null ? fast.next.next : null;
            slow = slow.next;
        }

        if (fast == null) {
            return null;
        }

        fast = head;
        while (fast != meet) {
            fast = fast.next;
            meet = meet.next;
        }
        return fast;
    }

    public static void main(String[] args) {
        int[] test = {3,2,0,-4};
        ListNode testNode = ListNode.createListNode(test);
        LinkedListcyce2 linkedListcyce2 = new LinkedListcyce2();
        System.out.println(linkedListcyce2.detectCycle(testNode));
    }
}
