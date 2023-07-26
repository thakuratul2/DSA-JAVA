/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class intersection_two_list {
    public class ListNode {

        public ListNode next;
    
    }
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //length of list A

        int lenA = 0;

        ListNode tempA = headA;

        while(tempA!=null){
            
            lenA++;

            tempA = tempA.next;
        }
         //length of list B

        int lenB = 0;

        ListNode tempB = headB;

        while(tempB!=null){
            lenB++;
            
            tempB = tempB.next;
        }

        //differnce
        int diff = Math.abs(lenA - lenB);

        //iterate the larger node

        tempA = headA;

        tempB= headB;

        if(lenA > lenB){
            while(diff-- > 0)
            
            tempA = tempA.next;
        }else{
            while(diff-- > 0)
            tempB = tempB.next;
        }

        //check the equality
        while(tempA !=tempB){
            tempA = tempA.next;
            tempB = tempB.next;

            if(tempA == null || tempB == null)
            return null;
        }
        return tempA;
    }
}