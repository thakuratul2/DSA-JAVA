/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class add_two_list {
    
public class ListNode {

    public int val;
    public ListNode next;
    

    public ListNode(int i) {
    }

}

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;

        while(l1!=null || l2!=null || carry!=0){
            //find the value
            int digit1 = (l1!=null)? l1.val:0;

            int digit2 = (l2!=null)? l2.val:0;

            int sum = digit1 + digit2 + carry;

            int digit = sum %10;
            
            carry = sum / 10;

            ListNode dummy = new ListNode(digit);
            tail.next = dummy;
            tail = tail.next;

            //check if any node remain
            l1 = (l1!=null)?l1.next:null;
            
            l2 = (l2!=null)?l2.next:null;

        }
        ListNode res = dummyHead.next;
        dummyHead.next = null;

        return res;
    }
}