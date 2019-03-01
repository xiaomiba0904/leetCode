package LeetCode;

public class Intersection {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        
        Integer headA_len = 0;
        ListNode nodeA = headA;
        while (nodeA != null) {
            nodeA = nodeA.next;
            headA_len++;
        }
        
        Integer headB_len = 0;
        ListNode nodeB = headB;
        while (nodeB != null) {
            nodeB = nodeB.next;
            headB_len++;
        }

        nodeA = headA;
        nodeB = headB;
        if (headA_len > headB_len) {
            for (int i = 0; i < headA_len - headB_len; i++) {
                nodeA = nodeA.next;
            }
        }else {
            for (int i = 0; i < headB_len - headA_len ; i++) {
                nodeB = nodeB.next;
            }
        }

        ListNode tmp;
        while ( nodeA != null && nodeB != null) {
            if (nodeA == nodeB) {
                tmp = nodeA;
                return tmp;
            }
            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }

        return null;
    }

    public static ListNode createListNode(int[] list) {
        ListNode head = null;
        ListNode now = null;

        for (Integer numb : list) {
            ListNode node = new ListNode(numb);
            if (head == null) {
                head = node;
                now = head;
            }else {
                now.next = node;
                now = node;
            }
        }

        return head;
    }

    public static void printListNode(ListNode head) {
        ListNode now = head;
        while (now != null) {
            System.out.printf("%d->", now.val);
            now = now.next;
        }
        System.out.println("\n");
    }
    
}
