public class LinkedListCycleII {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
 
public static class Solution {
    public ListNode hasCycle(ListNode head) {
        ListNode slow =head,
        fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                break;
            }            
        }
        if(fast==null || fast.next==null){
            return null;
        }
        ListNode n1=head,
        n2=slow;
        while(n1!=n2){
            n1=n1.next;
            n2=n2.next;
        }
        return n1;
    }
}

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        head.next.next.next.next.next = head.next.next;
        Solution solution = new Solution();

        ListNode startOfCycle = solution.hasCycle(head);
        System.out.println("Start of cycle: " + startOfCycle.val);
    }
}

