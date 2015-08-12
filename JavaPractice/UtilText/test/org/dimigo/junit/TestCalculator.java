package org.dimigo.junit;

import junit.framework.TestCase;

/**
 * Created by WOF on 15. 7. 14..
 */
public class TestCalculator extends TestCase{
	public void testAdd() {
		assertEquals(30, Calculator.add(20, 10));
	}

	public void testSub() {
		assertEquals(10, Calculator.sub(20, 10));
	}
}
