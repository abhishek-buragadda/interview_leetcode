import models.ListNode;


public class RemoveNthNode {

    public ListNode removeNthFromEnd(ListNode head, int n){
        int len = findLength(head);
        int diff = len-n;
        ListNode prev=null,current=head;
        if(diff == 0 ){
            return head.next ;
        }else{
            while( diff > 0 ){
                prev= current;
                current= current!=null?current.next : null;
                diff--;
            }
            prev.next = current.next;
        }
        return head;

    }

    private int  findLength(ListNode n ){
        int len = 0;
        while (n!= null ){
            n=n.next;
            len++;
        }
        return len;
    }

    /*  a better approach .


    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode first = dummy;
    ListNode second = dummy;
    // Advances first pointer so that the gap between first and second is n nodes apart
    for (int i = 1; i <= n + 1; i++) {
        first = first.next;
    }
    // Move first to the end, maintaining the gap
    while (first != null) {
        first = first.next;
        second = second.next;
    }
    second.next = second.next.next;
    return dummy.next;
    }


     */
}
