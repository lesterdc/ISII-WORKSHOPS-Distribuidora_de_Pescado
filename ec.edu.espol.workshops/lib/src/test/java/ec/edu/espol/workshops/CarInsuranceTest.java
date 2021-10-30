package ec.edu.espol.workshops;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarInsuranceTest {

	
	@Test
	public void testPremium1() {
		CarInsurance car = new CarInsurance();
		car.setAge(10);
		car.setSex('M');
		car.setMatital_status(false);
		car.Premium();
		int resultadoReal = car.getBase_premium();
		int resultadoEsperado = 2000;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	public void testPremium2() {
		CarInsurance car1 = new CarInsurance();
		car1.setAge(10);
		car1.setSex('F');
		car1.setMatital_status(false);
		car1.Premium();
		int resultadoReal = car1.getBase_premium();
		int resultadoEsperado = 500;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	public void testPremium3() {
		CarInsurance car3 = new CarInsurance();
		car3.setAge(10);
		car3.setSex('M');
		car3.setMatital_status(true);
		car3.Premium();
		int resultadoReal = car3.getBase_premium();
		int resultadoEsperado = 500;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	public void testPremium4() {
		CarInsurance car4 = new CarInsurance();
		car4.setAge(25);
		car4.setSex('M');
		car4.setMatital_status(true);
		car4.Premium();
		int resultadoReal = car4.getBase_premium();
		int resultadoEsperado = 500;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	public void testPremium5() {
		CarInsurance car5 = new CarInsurance();
		car5.setAge(10);
		car5.setSex('F');
		car5.setMatital_status(false);
		car5.Premium();
		int resultadoReal = car5.getBase_premium();
		int resultadoEsperado = 500;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	public void testPremium6() {
		CarInsurance car6 = new CarInsurance();
		car6.setAge(10);
		car6.setSex('F');
		car6.setMatital_status(true);
		car6.Premium();
		int resultadoReal = car6.getBase_premium();
		int resultadoEsperado = 300;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	public void testPremium7() {
		CarInsurance car7 = new CarInsurance();
		car7.setAge(45);
		car7.setSex('F');
		car7.setMatital_status(false);
		car7.Premium();
		int resultadoReal = car7.getBase_premium();
		int resultadoEsperado = 400;
		assertEquals(resultadoReal, resultadoEsperado);
	}

}
