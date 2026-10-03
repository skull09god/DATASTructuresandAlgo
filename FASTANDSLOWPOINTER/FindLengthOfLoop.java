public class FindLengthOfLoop {

    public static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }

        Node(int x, Node next) {
            this.data = x;
            this.next = next;
        }
    }

    public static class Solution {
        public int lengthOfLoop(Node head) {
            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (fast == slow) {
                    int len = 1;
                    Node cur = slow.next;

                    while (cur != slow) {
                        len++;
                        cur = cur.next;
                    }
                    return len;
                }
            }

            return 0;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Creating a loop: 5 -> 3 (Loop length = 3)
        head.next.next.next.next.next = head.next.next;

        Solution solution = new Solution();
        int loopLength = solution.lengthOfLoop(head);
        System.out.println("Length of loop: " + loopLength);
    }
}
