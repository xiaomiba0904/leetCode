package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class RemoveNthNodeFromEndOfList {

    private Map<Integer, ListNode> map = new HashMap<>();

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int nums = 0;
        ListNode thisNode = head;
        while(thisNode != null) {
            nums++;
            map.put(nums, thisNode);
            thisNode = thisNode.next;
        }

        if (n == nums) {
            return head.next;
        }else if (n < nums) {
            ListNode before = map.get(nums - n );
            before.next = before.next.next;
        }

        return head;
    }

    public static void main(String[] args) {
        RemoveNthNodeFromEndOfList list = new RemoveNthNodeFromEndOfList();
        int[] test = {1,2,3,4,5};
        ListNode head = ListNode.createListNode(test);
        list.removeNthFromEnd(head, 2);
    }
}
