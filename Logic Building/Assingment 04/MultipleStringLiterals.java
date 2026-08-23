//Multiple String Literals with same content

public class MultipleStringLiterals {
    public static void main(String[] args) {
        // Declare three string variables using identical string literals
        String str1 = "java";
        String str2 = "java";
        String str3 = "java";

        // Check if all three references point to the exact same object in memory
        boolean allSame = (str1 == str2) && (str2 == str3);

        // Print output matching the expected format
        System.out.println("All strings point to the same object: " + allSame);
    }
}

//Output:All strings point to the same object: true