package LeetCode;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode last = null;
        while (head != null){
            ListNode tmp = head;
            head = tmp.next;
            tmp.next = last;
            last = tmp;
        }
        return last;
    }

    public static void main(String[] args) {
        int[] test = {1,2,3,4};
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode testNode = ListNode.createListNode(test);
        ListNode.printListNode(testNode);
        ListNode.printListNode(reverseLinkedList.reverseList(testNode));

    }
}
