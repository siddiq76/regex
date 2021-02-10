package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserUc3 {
	public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        UserUc3 userRegistration = new UserUc3();
        String FirstName,LastName;

        System.out.println("Welcome to User Registration!");
        System.out.println("Enter First Name: ");
        userRegistration.nameValidation(scanner.next());
        System.out.println("Enter Last Name: ");
        userRegistration.nameValidation(scanner.next());
        System.out.println("Enter Email id: ");
        userRegistration.emaileValidation(scanner.next());

    }

    public void nameValidation(String name) {
        if (Pattern.matches("[A-Z][a-z]{2}[a-z]*", name)) {
            System.out.println("Valid Name");
        } else {
            System.out.println("Invalid Name");
        }
    }

    public void emaileValidation(String name) {
        if (Pattern.matches("^[A-Za-z0-9_][A-Za-z0-9_.]*[@]{1}[a-z]+[.][a-z]{2,8}$", name)) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}