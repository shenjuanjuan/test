package unitTestSJJ;

//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.Before;
//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import org.junit.Assert;
//import org.junit.Test;

class CalculateTest {
	
	private Calculate cal = new Calculate();;
	
	
	
	@Test
	void testMinus() {
		assertEquals(-1, cal.minus(1, 2));
	}


	@Test
	void testAdd() {
		assertEquals(4, cal.add(1, 3));
		//assertEquals("�����ӷ�������", -2, cal.add(-1, -1));
		//assertEquals("�����ӷ�������", 0, cal.add(1, -1));
		//assertEquals("������λ������", 102, cal.add(99, 3));
		
		
	}

	
	@Test
	void testDivide() {
		assertEquals(6, cal.divide(12, 2));
	}

	@Test
	void testMulti() {
		assertEquals(20, cal.multi(10, 2));
	}

}
