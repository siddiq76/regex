package regex;

public class UserRegistrationException extends Exception {
	
	public UserRegistrationException(String patternValidity) {
		super(patternValidity);
	}
}