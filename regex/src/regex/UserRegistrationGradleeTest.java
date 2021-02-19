package regex;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Scanner;

public class UserRegistrationGradleeTest {

	@Test
	public void UC1() {
		try {
			try {
				UserRegistrationGradlee userRegistrationGradlee = new UserRegistrationGradlee();
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter FirstName");
				String fName = sc.nextLine();
				boolean firstNameUserInput = userRegistrationGradlee.UC1(fName);
				Assert.assertTrue(firstNameUserInput);
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
		} catch (InvalidInputException e)

		{
			e.printStackTrace();
		}
	}

	@Test
	public void UC2() {
		try {
			try {
				UserRegistrationGradlee userRegistrationGradlee = new UserRegistrationGradlee();
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter LastName");
				String lName = sc.nextLine();
				boolean lastNameUserInput = userRegistrationGradlee.UC2(lName);
				Assert.assertTrue(lastNameUserInput);
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
		} catch (InvalidInputException e)

		{
			e.printStackTrace();
		}
	}

	@Test
	public void UC3() {

		try {
			try {
				UserRegistrationGradlee userRegistrationGradlee = new UserRegistrationGradlee();
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Email");
				String email = sc.nextLine();
				boolean emailUserInput = userRegistrationGradlee.UC3(email);
				Assert.assertTrue(emailUserInput);
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
		} catch (InvalidInputException e)

		{
			e.printStackTrace();
		}
	}

	@Test
	public void UC4() {

		try {
			try {
				UserRegistrationGradlee userRegistrationGradlee = new UserRegistrationGradlee();
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Mobile Number");
				String mobile = sc.nextLine();
				boolean mobileUserInput = userRegistrationGradlee.UC4(mobile);
				Assert.assertTrue(mobileUserInput);
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
		} catch (InvalidInputException e)

		{
			e.printStackTrace();
		}
	}

	
	@Test
	public void UC5PasswordRule() {

		try {
			try {
				UserRegistrationGradlee userRegistrationGradlee = new UserRegistrationGradlee();
				boolean passwordUserInput = userRegistrationGradlee.UC5("sid@19");
				Assert.assertTrue(passwordUserInput);
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
		} catch (InvalidInputException e)

		{
			e.printStackTrace();
		}
	}

	
	
}