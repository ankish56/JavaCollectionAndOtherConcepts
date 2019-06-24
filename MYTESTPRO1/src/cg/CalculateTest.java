package cg;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTest {

	@Test
	public void addtest() {
		Calculator ob=new Calculator();
		assertEquals(9, ob.add(4,5));;
	}

}
