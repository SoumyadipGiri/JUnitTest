package jUnitTestPackage;


import static org.junit.Assert.*;

import org.junit.Test;

public class AddStrings {

	@Test
	public void test() {
		JUnitTesting jUnit = new JUnitTesting();
		String result = jUnit.AddStrings("cod", "ing");
		assertEquals("coding",result);
	}

}

