public class palindrome_linked_list {
    
public class ListNode {

    public ListNode next;
    public Object val;

   

}

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast !=null && fast.next != null){
            //move by two times
            fast = fast.next.next;
            slow = slow.next;

        }
        slow = reversed(slow);
        fast = head;

        while(slow != null){
            if(slow.val != fast.val){

                return false;
                
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

public ListNode reversed(ListNode head){
    ListNode prev = null;

    while(head != null){
        ListNode next = head.next;
        head.next = prev;
        prev = head;
        head = next;
    }

    return prev;
}
}

