package cg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class ValidatoTest {

	@Test
	void test1() {
		Validator ob = new Validator();
		String data = "100";
		//Assumptions.assumeFalse(data==null);
		Assumptions.assumeTrue(data!=null);
		System.out.println("assertTrue");
		assertTrue(ob.validateNo(data));
		
		System.out.println("assertFalse");
		data = "abc";
		assertFalse(ob.validateNo(data));
		
	}
	
	
	@Test
	void test2() {
		Validator ob = new Validator();
		//assertTrue(ob.validateNo(null));
		assertThrows(NullPointerException.class,()->ob.validateNo(null));
		
	}

	/*
	 * 
	 *   class ________________ implements Executable
	 *   {
	 *   
	 *   public boolean execute()
	 *   {
	 *   return ob.validateNo(null);
	 *   }
	 *   
	 *   }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
	
	
	
	
}
