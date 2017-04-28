package my_first_maven;

import java.util.*;

import org.w3c.dom.Node;





public class DoubleLinkedList {

		Node head;
   	
		public static class Node {
			 
	        int data;
	        public Node next;
	        public Node prev;
	        public Node(int d) {
	            data = d;
	            next = null;
	        }
	        }
		
		  public void add(int data) {
		      Node newNode = new Node(data);
		      if (head == null) {
		        head = newNode;
		      } else {
		        Node current = head;
		        while (current.next != null) {
		            current = current.next;
		        }
		        current.next = newNode;
		        newNode.prev = current;
		      }
		  }

		  public void print() {
		      Node current = head;
		      while (current != null) {
		          System.out.print(current.data);
		          if (current.next != null)
		              System.out.print(" -> ");
		          current = current.next;
		      }
		      System.out.println();
		  }

		  public int size() {
		      int size = 0;
		      Node current = head;
		      while (current != null) {
		          size++;
		          current = current.next;
		      }
		      return size;
		  }

		  public void addIntoHead(int data) {
		      Node newNode = new Node(data);

		     if (head == null) {
		          head = newNode;
		      } else {
		          head.prev = newNode;
		          newNode.next = head;
		          head = newNode;
		      }
		  }

		  public int returnHead() {
		      return head.data;
		  }

		  public void addInMiddle(int prevData, int data) {
		      Node current = head;
		      while (current != null) {
		        if (current.data != prevData) {
		            current = current.next;
		        } else{
		            break;
		        }
		      }
		      Node newNode = new Node(data);
		      newNode.next = current.next;
		      current.next.prev = newNode;
		      newNode.prev = current;
		      current.next = newNode;
		  }
}
