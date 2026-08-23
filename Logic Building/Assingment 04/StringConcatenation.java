//String Concatnation and object creation

public class StringConcatenation{
    public static void main(String[] args) {
        // Create initial string variables
        String str1 = "hello";
        String str2 = "world";

        // Concatenate variables using the + operator
        String str3 = str1 + str2;

        // Checks if str3 points to the same object as str1
        boolean isSameObject = (str3 == str1);

        // Print output matching the expected format
        System.out.println("Is str3 pointing to the same object as str1? " + isSameObject);
    }
}





//Output:Is str3 pointing to the same object as str1? false