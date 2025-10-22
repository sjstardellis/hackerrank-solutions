package Solutions;

import static java.util.stream.Collectors.joining;

class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

class SinglyLinkedList {
    public SinglyLinkedListNode head;
    public SinglyLinkedListNode tail;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }

        this.tail = node;
    }
}

class SinglyLinkedListPrintHelper {
    public static void printList(SinglyLinkedListNode node, String sep) {
        while (node != null) {
            System.out.print(node.data);

            node = node.next;

            if (node != null) {
                System.out.print(sep);
            }
        }
    }
}



class deleteDuplicates {

    /*
     * Complete the 'deleteDuplicates' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts INTEGER_SINGLY_LINKED_LIST head as parameter.
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public SinglyLinkedListNode deleteDuplicates(SinglyLinkedListNode head) {
        // start at the head
        SinglyLinkedListNode current = head;

        // while the current node is not null and the next node is not null
        while(current != null && current.next != null) {
            // check to see if the next node is the same
            if (current.data == current.next.data) {
                // change pointer from being the next node to being the one after
                current.next = current.next.next;
            } else {
                // just iterate forward
                current = current.next;
            }
        }
        return head;
    }

}
