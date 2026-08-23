//String creation with new keyword

public class StringNewKeyword{
    public static void main(String[] args) {
        // Create two string objects using the new keyword
        String str1 = new String("hello");
        String str2 = new String("hello");

        // Compare references using ==
        System.out.println("Using == : " + (str1 == str2));

        // Compare actual text content using .equals()
        System.out.println("Using .equals(): " + str1.equals(str2));
    }
}





/*
Using == : false
Using .equals(): true
*/