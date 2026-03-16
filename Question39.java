public class Question39 {

    // Reverse a Singly Linked List
    // Input:  [1, 2, 3, 4, 5]
    // Output: [5, 4, 3, 2, 1]

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int v) { val = v; }
    }

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        print(reverse(head));  // Output: 5 4 3 2 1
    }
}
