package testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import mahender.Rlinkedlist;
import mahender.Rlinkedlist.Node;

public class RlinkedlistTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Rlinkedlist list = new Rlinkedlist();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
        Node result=list.head;
        assertArrayEquals(new int[]{20,4,15,85}, result);
        
	}

	private void assertArrayEquals(int[] is, Node result) {
		// TODO Auto-generated method stub
		
	}

	
}
