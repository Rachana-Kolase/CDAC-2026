//String Literal and Object creation

public class StringComparison {
    public static void main(String[] args) {
        // Create two string variables using literals
        String str1 = "hello";
        String str2 = "hello";

        // Check if both reference the same object in memory using the '==' operator
        boolean isSameObject = (str1 == str2);

        // Print the output
        System.out.println("Both variables point to the same object: " + isSameObject);
    }
}

//Output:Both variables point to the same object: true
