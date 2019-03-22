package LeetCode;

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }else if (lists.length == 1) {
            return lists[0];
        }

        int mix_index;
        ListNode mix;
        ListNode head=null;
        ListNode thisNode=null;

        while (true) {
            mix = null;
            mix_index = -1;
            int mix_value = Integer.MAX_VALUE;
            for (int i = 0; i < lists.length; i++) {
                ListNode node = lists[i];
                if (node != null && node.val < mix_value) {
                    mix_value = node.val;
                    mix = node;
                    mix_index = i;
                }

            }

            if (mix == null) {
                break;
            }
            lists[mix_index] = lists[mix_index].next;
            if (head == null) {
                head = mix;
                thisNode = head;
            }else {
                thisNode.next = mix;
                thisNode = thisNode.next;
            }
        }

        return head;
    }

    /*
    分治
     */
    public ListNode mergeKLists2(ListNode[] lists) {
        if(lists==null || lists.length == 0) return null;
        return sort(lists, 0, lists.length-1);
    }
    public ListNode sort(ListNode[] lists, int low, int high){
        if(low>=high)
            return lists[low];
        int mid = (high-low)/2 + low;
        ListNode l1 = sort(lists, low, mid);
        ListNode l2 = sort(lists, mid+1, high);
        return merge(l1,l2);
    }
    public ListNode merge(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode dummy = new ListNode(0);
        dummy.next = l1;
        ListNode cur = dummy;
        while(l1 != null && l2!=null){
            if(l1.val<l2.val){
                l1 = l1.next;
            }
            else{
                ListNode next = l2.next;
                l2.next = cur.next;
                cur.next = l2;
                l2 = next;
            }
            cur = cur.next;
        }
        if(l2 != null){
            cur.next = l2;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        int[] test_int = {1,4,5};
        int[] test_int2 = {1,3,4};
        int[] test_int3 = {2,6};
        ListNode test1 = ListNode.createListNode(test_int);
        ListNode test2 = ListNode.createListNode(test_int2);
        ListNode test3 = ListNode.createListNode(test_int3);

        ListNode[] t = new ListNode[3];
        t[0] = test1;
        t[1] = test2;
        t[2] = test3;

        MergeKSortedLists mergeKSortedLists = new MergeKSortedLists();
        ListNode.printListNode(mergeKSortedLists.mergeKLists(t));
    }
}
