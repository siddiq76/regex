package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserUc4 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        UserUc4 userRegistration = new UserUc4();
        String FirstName,LastName;

        System.out.println("Welcome to User Registration!");
        System.out.println("Enter First Name: ");
        userRegistration.nameValidation(scanner.next());
        System.out.println("Enter Last Name: ");
        userRegistration.nameValidation(scanner.next());
        System.out.println("Enter Email id: ");
        userRegistration.emaileValidation(scanner.next());
        System.out.println("Enter mobile Number: ");
        userRegistration.mobileNumberValidation(scanner.nextLine());
        scanner.next();

    }

    public void nameValidation(String name) {
        if (Pattern.matches("[A-Z][a-z]{2}[a-z]*", name)) {
            System.out.println("Valid Name");
        } else {
            System.out.println("Invalid Name");
        }
    }

    public void emaileValidation(String name) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";
        if (Pattern.matches(regex, name)) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }

    public void mobileNumberValidation(String num) {
        if (Pattern.matches("^[1-9]{1,3}[ ]{1}[1-9]{1}[0-9]{9}$", num)) {
            System.out.println("Valid mobile Number.");
        } else {
            System.out.println("Invalid mobile Number.");
        }
    }
}