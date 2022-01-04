//Reverse Linked List Solution

// Java program for reversing the linked list

class LinkedList {

    static ListNode head;

    static class ListNode {

        int val;
        ListNode next;

        ListNode(int v)
        {
            val = v;
            next = null;
        }
    }

    /* Function to reverse the linked list */
    ListNode reverse(ListNode node)
    {
        ListNode prev = null;
        ListNode current = node;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    // prints content of double linked list
    void printList(ListNode node)
    {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.head = new ListNode(1);
        list.head.next = new ListNode(2);
        list.head.next.next = new ListNode(3);
        list.head.next.next.next = new ListNode(4);

        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
}

// print
        /*
        Given Linked list
        1 2 3 4
        Reversed linked list
        4 3 2 1
        */

