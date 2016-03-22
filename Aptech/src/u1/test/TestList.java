package u1.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.Test;

public class TestList {
	
	
	@Test
	public void testArrayList() {
		 ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < 100000; i++) {
			list.add(0,i + "");
		}
	}
	
	@Test
	public void testLinkedList() {
		LinkedList<String> list = new LinkedList<String>();
		for (int i = 0; i < 100000; i++) {
			list.add(0,i + "");
		}
	}

}
