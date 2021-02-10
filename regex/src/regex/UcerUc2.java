package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UcerUc2 {
	public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        UcerUc2 userRegistration = new UcerUc2();
        String firstName;

        System.out.println("Welcome to User Registration!");
        System.out.println("Enter First Name: ");
        userRegistration.nameValidation(scanner.next());
        System.out.println("Enter First Name: ");
        userRegistration.nameValidation(scanner.next());

    }

    public void nameValidation(String name) {
        if (Pattern.matches("[A-Z][a-z]{2}[a-z]*", name)) {
            System.out.println("Valid Name");
        } else {
            System.out.println("Invalid Name");
        }
    }
}
