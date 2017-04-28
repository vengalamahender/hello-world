package mahender;

import java.util.NoSuchElementException;

/**
 * An implementation of a queue using singly linked nodes.  The
 * queue itself maintains links to both the head and the tail
 * node, so that both enqueuing and dequeueing are O(1).
 */
public class Queue  {
    private class Node {
        public Object data;
        public Node next;
        public Node(Object data, Node next) {
            this.data = data;
          this.next = next;
       }
   }

    private Node head = null;
    private Node tail = null;

    public void enqueue(Object item) {
        Node newNode = new Node(item, null);
        if (isEmpty()) {head = newNode;} else {tail.next = newNode;}
        tail = newNode;
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Object item = head.data;
        if (tail == head) {
            tail = null;
        }
        head = head.next;
        return item;
    }

    public Object peek() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        return head.data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int count = 0;
        for (Node node = head; node != null; node = node.next) {
            count++;
        }
        return count;
    }
    
}