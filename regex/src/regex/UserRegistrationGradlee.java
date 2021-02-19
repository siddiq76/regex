package regex;

import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationGradlee {

	public boolean UC1(String firstNameUserInput) throws InvalidInputException {
		Predicate<String> fName = Pattern.compile("[A-Z]{1}[a-z]{2,}$").asPredicate();
		System.out.println("Validity of FirstName:" + fName.test(firstNameUserInput));
		if (fName.test(firstNameUserInput) == true)
			return true;
		else
			throw new InvalidInputException("Enter Valid First Name ");
	}

	public boolean UC2(String lastNameUserInput) throws InvalidInputException {
		Predicate<String> lName = Pattern.compile("[A-Z]{1}[a-z]{2,}$").asPredicate();;
		System.out.println("Validity of LastName:" + lName.test(lastNameUserInput));
		if (lName.test(lastNameUserInput) == true)
			return true;
		else
			throw new InvalidInputException("Enter Valid Last Name ");
	}

	public boolean UC3(String emailUserInput) throws InvalidInputException {
		Predicate<String> email = Pattern.compile("^[a-zA-Z]{3}\\.[a-zA-Z]{1,}@[a-zA-Z]{2}\\.[a-zA-Z]{2}\\.[a-zA-Z]{1,}$").asPredicate();
		System.out.println("Validity of user Email:" + email.test(emailUserInput));
		if (email.test(emailUserInput) == true)
			return true;
		else
			throw new InvalidInputException("Enter Valid Email ");
	}

	public boolean UC4(String mobileUserInput) throws InvalidInputException {
		Predicate<String> mobile = Pattern.compile("^[1-9]{2}\\s{1}[0-9]{1}[0-9]{9}$").asPredicate();
		System.out.println("Validity of Mobile Number:" + mobile.test(mobileUserInput));
		if (mobile.test(mobileUserInput) == true)
			return true;
		else
			throw new InvalidInputException("Enter Valid Mobile Number ");
	}

	public boolean UC5(String passwordUserInput) throws InvalidInputException {
		Predicate<String> password = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{8,}").asPredicate();
		System.out.println("Validity of Password:" + password.test(passwordUserInput));
		if (password.test(passwordUserInput) == true)
			return true;
		else
			throw new InvalidInputException("Enter Valid Password ");
	}

	
}
