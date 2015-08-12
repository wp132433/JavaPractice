package org.dimigo.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by WOF on 15. 7. 14..
 */
public class TestCalculator2 {

	@Test
	public void testAdd() {
		assertEquals(30, Calculator.add(20, 10));
	}
}
