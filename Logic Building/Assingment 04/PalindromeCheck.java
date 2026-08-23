//Check if a String is Palindrome

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        //Use StringBuilder to Reverse the string
        String reversed = new StringBuilder(original).reverse().toString();

        // Checks if the original string matches the reversed string
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("The string '" + original + "' is a palindrome.");
        } else {
            System.out.println("The string '" + original + "' is not a palindrome.");
        }
    }
}

/*Output:
Enter a string: madam
The string 'madam' is a palindrome.*/