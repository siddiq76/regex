package regex;

public class UserRegistrationExceptionn extends Exception {
	
	public UserRegistrationExceptionn(String patternValidity) {
		super(patternValidity);
	}
}