package incubyte;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
//import org.junit.jupiter.api.Test;

public class TestCases {

	@Test
	public void test1() {
		
		Calculator obj = new Calculator();
		int actual = obj.add("");
		int expected = 0;
		
		assertEquals(actual , expected);
	}
	
	@Test
	public void test2() {
		
		Calculator obj = new Calculator();
		int actual = obj.add("2");
		int expected = 2;
		
		assertEquals(actual , expected);
	}

	@Test
	public void test3() {
		
		Calculator obj = new Calculator();
		int actual = obj.add("1,2");
		int expected = 3;
		
		assertEquals(actual , expected);
	}
	
	@Test
	public void test4() {
		
		Calculator obj = new Calculator();
		int actual = obj.add("1\n2,2");
		int expected = 5;
		
		assertEquals(actual , expected);
	}
	
	@Test
	public void test5() {
		
		Calculator obj = new Calculator();
		int actual = obj.add("1,2\n3");
		int expected = 6;
		
		assertEquals(actual , expected);
	}
	
	@Test
	public void test6() {
		
		Calculator obj = new Calculator();
		int actual = obj.add("1\n2\n3,4\n5\n6");
		int expected = 21;
		
		assertEquals(actual , expected);
	}
	
	@Test
	public void test7() {
		
		Calculator obj = new Calculator();
		int actual = obj.add("//;\n1;2");
		int expected = 3;
		
		assertEquals(actual , expected);
	}
	
	@Test(expected=NegativeNumberException.class)
	public void test8() {
		
		Calculator obj = new Calculator();
		obj.add("-1,2");
	}
	
	@Test
	public void test9() {
		
		Calculator obj = new Calculator();
		int actual = obj.add("1,2,3");
		int expected = -1;
		
		assertEquals(actual , expected);
	}

}
