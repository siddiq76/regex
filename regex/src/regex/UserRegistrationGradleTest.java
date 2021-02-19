package regex;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Scanner;

public class UserRegistrationGradleTest {
	
	static String Happy = null;
	 	
	public void UC1() throws UserRegistrationException {
		UserRegistrationGradle userRegistrationGradle = new UserRegistrationGradle();
		String firstNameUserInput = userRegistrationGradle.UC1("sid");
		try {			
			userRegistrationGradle.UC1(Happy);
			}	
		catch(UserRegistrationException e) {
			//Assert Statement
			assertEquals("Please enter valid first name", e.getMessage());
			}
	}
	
	public static void UC2() throws UserRegistrationException {
		UserRegistrationGradle userRegistrationGradle = new UserRegistrationGradle();
		String lastNameUserInput = userRegistrationGradle.UC2("khan");
		try {			
			userRegistrationGradle.UC2(Happy);
			}	
		catch(UserRegistrationException e) {
			//Assert Statement
			assertEquals("Please enter valid last name", e.getMessage());
			}
	}
	
	public static void UC3() throws UserRegistrationException {
		UserRegistrationGradle userRegistrationGradle = new UserRegistrationGradle();
		String emailUserInput = userRegistrationGradle.UC3("abc.xyz@bl.co.in");
		try {			
			userRegistrationGradle.UC3(Happy);
			}	
		catch(UserRegistrationException e) {
			//Assert Statement
			assertEquals("Please enter valid email", e.getMessage());
			}
	}
	
	public static void UC4() throws UserRegistrationException {
		UserRegistrationGradle userRegistrationGradle = new UserRegistrationGradle();
		String mobileUserInput = userRegistrationGradle.UC4("91 986523244");
		try {			
			userRegistrationGradle.UC4(Happy);
			}	
		catch(UserRegistrationException e) {
			//Assert Statement
			assertEquals("Please enter valid mobile number", e.getMessage());
			}
	}
	
	
	public static void UC5PasswordRule() throws UserRegistrationException {
		UserRegistrationGradle userRegistrationGradle = new UserRegistrationGradle();
		String passwordUserInput = userRegistrationGradle.UC5("sid");
		try {			
			userRegistrationGradle.UC5(Happy);
			}	
		catch(UserRegistrationException e) {
			//Assert Statement
			assertEquals("Please enter valid password", e.getMessage());
			}
	}
	
	
	
	
}