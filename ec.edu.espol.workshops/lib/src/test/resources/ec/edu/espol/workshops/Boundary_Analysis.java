package ec.edu.espol.workshops;

import static org.junit.Assert.*;

import org.junit.Test;

public class Boundary_Analysis {

	@Test
	public void testCase01() {
		CarInsurance testCase01= new CarInsurance();
		testCase01.setAge(18);
		testCase01.setSex('M');
		testCase01.setMatital_status(false);
		testCase01.Premium();
		assertEquals(2000,testCase01.getBase_premium());
	}
	
	@Test
	public void testCase02() {
		CarInsurance testCase02= new CarInsurance();
		testCase02.setSex('M');
		testCase02.setMatital_status(false);
		testCase02.Premium();
		assertEquals(null,testCase02.getBase_premium());
	}
	
	@Test
	public void testCase03() {
		CarInsurance testCase03= new CarInsurance();
		testCase03.setAge(23);
		testCase03.setSex('M');
		testCase03.setMatital_status(false);
		testCase03.Premium();
		assertEquals(2000,testCase03.getBase_premium());
	}
	
	@Test
	public void testCase4() {
		CarInsurance testCase04= new CarInsurance();
		testCase04.setAge(25);
		testCase04.setSex('M');
		testCase04.setMatital_status(true);
		testCase04.Premium();
		assertEquals(300,testCase04.getBase_premium());
	}
	
	@Test
	public void testCase05() {
		CarInsurance testCase05= new CarInsurance();
		testCase05.setAge(24);
		testCase05.setSex('M');
		testCase05.setMatital_status(true);
		testCase05.Premium();
		assertEquals(2000,testCase05.getBase_premium());
	}
	
	@Test
	public void testCase06() {
		CarInsurance testCase06= new CarInsurance();
		testCase06.setAge(40);
		testCase06.setSex('M');
		testCase06.setMatital_status(true);
		testCase06.Premium();
		assertEquals(300,testCase06.getBase_premium());
	}
	
	@Test
	public void testCase07() {
		CarInsurance testCase07= new CarInsurance();
		testCase07.setAge(45);
		testCase07.setSex('M');
		testCase07.setMatital_status(true);
		testCase07.Premium();
		assertEquals(400,testCase07.getBase_premium());
	}

}
