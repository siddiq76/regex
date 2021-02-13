package regex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;



class UC11testingTest {

	UC11testing userRegistration = new UC11testing();
	@Test
	public void test() {
		boolean result = UC11testing.FName();
		assertEquals(true, result);
		
	}
	@Test
	public void test1() {
		boolean result = UC11testing.LName();
		assertEquals(true, result);
		
	}
	@Test
	public void test2() {
		boolean result = UC11testing.Email();
		assertEquals(true, result);
		
	}
	@Test
	public void test3() {
		boolean result = UC11testing.PhoneNumber();
		assertEquals(true, result);
		
	}
	@Test
	public void test4() {
		boolean result = UC11testing.Password();
		assertEquals(true, result);
		
	}
	@Test
    public void validateEmail(){
        String testValidString1 = userRegistration.multipleEmail("sid@gmail.com");
        String testValidString2 = userRegistration.multipleEmail("sid.178@gmail.com");
        String testValidString3 = userRegistration.multipleEmail("sid_898@gmail.com");
        
        String testInvalidString1 = userRegistration.multipleEmail("sid@.com");
        String testInvalidString2 = userRegistration.multipleEmail("sid");
        String testInvalidString3 = userRegistration.multipleEmail("sid123@gmail.my");
       

        Assert.assertEquals("Happy",testValidString1);
        Assert.assertEquals("Happy",testValidString2);
        Assert.assertEquals("Happy",testValidString3);
        
       


        Assert.assertEquals("Sad",testInvalidString1);
        Assert.assertEquals("Sad",testInvalidString2);
        Assert.assertEquals("Sad",testInvalidString3);
        
        
    }

    

}
