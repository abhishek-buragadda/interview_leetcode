import  models.ListNode;

/**
 *
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
class AddTwoLinkedLists {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        makeListsEqual(l1,l2);
        ListNode result=null,current=null  ;
        int carry = 0 ;
        while(l1 != null){
            int temp  = l1.val + l2.val + carry ;
            carry = temp/10;
            temp = temp%10;
            if(result == null){
                result = new ListNode(temp);
                current =result ;
            }
            else{
                current.next = new ListNode(temp);
                current = current.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        if(carry != 0 ){
            current.next = new ListNode(carry);
        }
        return result ;

    }
    int findLen(ListNode l1){
        int count = 0 ;
        while(l1!= null){
            l1= l1.next;
            count++;
        }
        return count ;
    }

    void adjustList(ListNode l1, int length ){

        while(l1.next != null){
            l1 = l1.next;
        }
        while(length>0){
            l1.next = new ListNode(0);
            l1 = l1.next;
            length--;
        }
    }
    void  makeListsEqual(ListNode l1, ListNode l2){
        int maxLength = 0;
        int length1 = findLen(l1);
        int length2 = findLen(l2);
        if( length1 == length2){
            return;
        }else{
            maxLength = (length1 >= length2)? length1: length2;
        }
        if(maxLength == length1 ){
            adjustList(l2, maxLength- length2 );
        }else{
            adjustList(l1,maxLength -length1);
        }
    }
}