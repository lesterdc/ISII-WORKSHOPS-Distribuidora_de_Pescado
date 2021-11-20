package ec.edu.espol.workshops;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testing {

	@Test
	public void testCase01() {
		CarInsurance testCase01= new CarInsurance();
		testCase01.setAge(15);
		testCase01.setSex('M');
		testCase01.setMatital_status(false);
		testCase01.Premium();
		assertEquals(2000,testCase01.getBase_premium());
	}
	
	@Test
	public void testCase02() {
		CarInsurance testCase02= new CarInsurance();
		testCase02.setAge(26);
		testCase02.setMatital_status(true);
		testCase02.setSex('F');
		testCase02.Premium();
		assertEquals(300,testCase02.getBase_premium());
	}

	@Test
	public void testCase03() {
		CarInsurance testCase03 = new CarInsurance();
		testCase03.setAge(50);
		testCase03.setSex('F');
		testCase03.setMatital_status(false);
		testCase03.Premium();
		assertEquals(400,testCase03.getBase_premium());
	}
	
	@Test
	public void testCase04() {
		CarInsurance testCase04 = new CarInsurance();
		testCase04.setAge(50);
		testCase04.setSex('M');
		testCase04.setMatital_status(false);
		testCase04.Premium();
		assertEquals(400,testCase04.getBase_premium());
	}


}
