public class Question40 {

    // Detect Loop in Linked List (Floyd's Cycle Detection)
    // Input:  [3, 2, 0, -4] with tail connected to node at index 1
    // Output: true

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int v) { val = v; }
    }

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Create list: 3 -> 2 -> 0 -> -4 -> (back to 2)
        ListNode head  = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        head.next  = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // creates cycle

        System.out.println(hasCycle(head));  // Output: true
    }
}
