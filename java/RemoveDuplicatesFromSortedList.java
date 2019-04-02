package LeetCode;

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode thisNode = head;
        ListNode lastNode = null;
        while(thisNode != null) {
            if (lastNode != null && lastNode.val == thisNode.val) {
                lastNode.next = thisNode.next;
            }else{
                lastNode = thisNode;
            }
            thisNode = thisNode.next;
        }
        return head;
    }

    public ListNode deleteDuplicates2(ListNode head) {
        ListNode thisNode = head;
        while (thisNode != null) {
            if (thisNode.next != null && thisNode.val == thisNode.next.val) {
                thisNode.next = thisNode.next.next;
            }else {
                thisNode = thisNode.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        int[] test = {1,1,1};
        ListNode testList = ListNode.createListNode(test);
        RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();
        ListNode result = removeDuplicatesFromSortedList.deleteDuplicates2(testList);
        ListNode.printListNode(result);
    }
}
