package regex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class UserUc10testingTest {

	
	@Test
	public void trial() {
		boolean result = UserUc10testing.FName();
		assertEquals(true, result);
		
	}
	@Test
	public void trial1() {
		boolean result = UserUc10testing.LName();
		assertEquals(true, result);
		
	}
	@Test
	public void trial2() {
		boolean result = UserUc10testing.Email();
		assertEquals(true, result);
		
	}
	@Test
	public void trial3() {
		boolean result = UserUc10testing.PhoneNumber();
		assertEquals(true, result);
		
	}
	@Test
	public void trial4() {
		boolean result = UserUc10testing.Password();
		assertEquals(true, result);
		
	}

}
