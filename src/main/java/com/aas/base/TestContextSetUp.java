package com.aas.base;

import com.aas.pages.PageObjectManager;


public class TestContextSetUp {
	public TestBase testBase;
	public PageObjectManager pob;


	public TestContextSetUp() throws Exception {
		testBase = new TestBase();
		pob = new PageObjectManager(testBase.setUp());
		
	}
}
