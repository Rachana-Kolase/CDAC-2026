//Find Index of an Element in an Array

import java.util.Scanner;
import java.util.Arrays;

public class FindIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.print("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int target = sc.nextInt();

        int index = -1;
        for (int i = 0; i < 5; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("The number " + target + " is found at index " + index);
        } else {
            System.out.println("Not Found");
        }
    }
}




/*Output:
Enter 5 integers: 5
10
15
20
25
Enter the number to search: 15
The number 15 is found at index 2*/