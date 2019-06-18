package com.example.demo;

import org.junit.Before;
import org.junit.Test;

public class ListManagerTests {

	ListManager manager;
	
	@Before
	public void startUp() {
		manager = new ListManager();
	}
	
	@Test
	public void removeItem() {
		manager.addItem("Zech");
		manager.removeItem("Zech");
		assertEquals(0,manager.getItems().size());
	}
	@Test
	public void addItem() {
		
	}
}
