//Check if any Array contains a specific element

import java.util.Scanner;
import java.util.Arrays;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] arr = new Integer[5]; // Use Integer object array for Arrays.asList()

        System.out.print("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int target = sc.nextInt();

        // Check using Arrays.asList().contains()
        if (Arrays.asList(arr).contains(target)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}




/*Output:
Enter 5 integers: 10
20
30
40
50
Enter the number to search: 30
Found*/