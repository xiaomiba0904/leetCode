package LeetCode;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode thisNode = head;
        ListNode lastNode = null;
        while(thisNode != null) {
            if (thisNode.val == val) {
                if (lastNode == null) {
                    head = head.next;
                    thisNode = thisNode.next;
                }else {
                    if(thisNode.next == null) {
                        thisNode = thisNode.next;
                        lastNode.next = null;
                    }else {
                        lastNode.next = thisNode.next;
                        thisNode = thisNode.next;
                    }
                }
            }else{
                lastNode = thisNode;
                thisNode = thisNode.next;
            }
        }
        return head;
    }
}
