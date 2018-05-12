import models.ListNode;

public class MergeSortedLists {


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = null, current = null;
        while (l1 != null && l2 != null) {
            boolean equalVal = false;
            int tempval;
            if (l1.val > l2.val) {
                tempval = l2.val;
                l2 = l2.next;
            } else if (l1.val < l2.val) {
                tempval = l1.val;
                l1 = l1.next;
            } else {
                tempval = l1.val;
                equalVal = true;
                l1 = l1.next;
                l2 = l2.next;
            }
            if (result == null) {
                result = new ListNode(tempval);
                current = result;
            } else {
                current.next = new ListNode(tempval);
                current = current.next;

            }
            if (equalVal) {
                current.next = new ListNode(tempval);
                current = current.next;
            }
        }
        if (l1 == null && l2 != null) {
            if (result == null) {
                result = l2;
            } else {
                current.next = l2;
            }
        } else if (l2 == null && l1 != null) {
            if (result == null) {
                result = l1;
            } else {
                current.next = l1;
            }
        }
        return result;
    }
}
