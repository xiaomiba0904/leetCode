package LeetCode;

public class RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        if (k <= 0 || head == null || head.next == null) {
            return head;
        }

        ListNode t = head;
        Integer len = 1;
        while (true) {
            if (t.next != null) {
                len++;
                t = t.next;
            }else {
                if (k%len == 0) {
                    return head;
                }
                t.next = head;
                break;
            }

        }

        k = len - (k%len);
        t = head;
        for (int i = 0; i < k-1; i++) {
            t = t.next;
        }
        head = t.next;
        t.next = null;

        return head;
    }

    public void printListNode(ListNode head) {
        ListNode t = head;

        while (t != null) {
            System.out.printf("%d->", t.val);
            t = t.next;
        }
        System.out.println("\n");
    }

    public ListNode create(int nums){

        ListNode head = new ListNode(0);
        if (nums <=1) {
            return head;
        }
        ListNode last;
        last = head;
        for (int i = 1; i <nums ; i++) {
            ListNode newNode = new ListNode(i);
            last.next = newNode;
            newNode.next = null;
            last = newNode;
        }

        return head;
    }

    public static void main(String[] args) {

        RotateList rotateList = new RotateList();

//        ListNode test = rotateList.create(4);
//        rotateList.printListNode(test);
        ListNode test = null;

        ListNode result = rotateList.rotateRight(test, 0);
        rotateList.printListNode(result);
    }
}
