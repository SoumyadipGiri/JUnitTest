package jUnitTestPackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AddNumbers.class, AddStrings.class })
public class AllTests{
	@Test
	public void test() {
		JUnitTesting jUnit = new JUnitTesting();
		String result = jUnit.AddStrings("cod", "ing");
		assertEquals("coding", result);
		
		int result1 = jUnit.AddNumbers(50, 100);
		assertEquals(150, result1);
	}
}
