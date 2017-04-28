package testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import mahender.SinglyLinkedList;


public class SinglyLinkedListTest { 
	@Test 
	public void testNewLinkedList()
	{ 
		
		SinglyLinkedList singly = new SinglyLinkedList(); 
		assertTrue(singly.isEmpty()); // linked list should be empty 
		assertEquals(0, singly.length()); // length of linked list should be zero 
		singly.insert("ABC"); assertFalse(singly.isEmpty()); // linked list should not be empty 
		assertEquals(1, singly.length()); // length of linked list should be 1 } }
	}
}

