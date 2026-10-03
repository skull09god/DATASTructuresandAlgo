public class LinkedListCycle {
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
    public boolean hasCycle(ListNode head) {
        ListNode slow =head,
        fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }

            
        }
        return false;
    }
}

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        head.next.next.next.next.next = head.next.next;
        Solution solution = new Solution();

        boolean hasCycle = solution.hasCycle(head);
        System.out.println("Has cycle: " + hasCycle);
    }
}

