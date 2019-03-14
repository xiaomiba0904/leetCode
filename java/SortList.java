package LeetCode;

public class SortList {

    public ListNode sortList(ListNode head) {
        return head == null ? null : mergeSort(head);
    }

    /**
     * 归并排序
     * @param head
     * @return
     */
    private ListNode mergeSort(ListNode head) {
        if(head.next == null) {
            return head;
        }

        ListNode p = head;
        ListNode q = head;
        ListNode pre = null;

        while (q != null && q.next != null) {
            pre = p;
            p = p.next;
            q = q.next.next;
        }
        pre.next = null;
        ListNode l = mergeSort(head);
        ListNode r = mergeSort(p);
        return merge(l, r);
    }

    private ListNode merge(ListNode l, ListNode r) {
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;

        while (l != null && r != null) {
            if (l.val < r.val) {
                cur.next = l;
                cur = cur.next;
                l = l.next;
            } else {
                cur.next = r;
                cur = cur.next;
                r = r.next;
            }
        }

        if (l != null) {
            cur.next = l;
        }
        if (r != null) {
            cur.next = r;
        }

        return dummyHead.next;

    }

    public static void main(String[] args) {
        int[] test = {4, 2, 1, 3};
        ListNode list = ListNode.createListNode(test);

        SortList sortList = new SortList();

        ListNode resutl = sortList.sortList(list);
        ListNode.printListNode(resutl);
    }
}
