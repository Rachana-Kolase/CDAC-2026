//Count Positive and Negative Numbers in Array

import java.util.Scanner;

public class CountPositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6]; 

        System.out.print("Enter 6 numbers: ");
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }

        int positiveCount = 0;
        int negativeCount = 0;

        for (int num : arr) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }
        }

        System.out.println("Positive numbers count: " + positiveCount);
        System.out.println("Negative numbers count: " + negativeCount);
    }
}




/*Output:
Enter 6 numbers: -3
3
7
-2
0
8
Positive numbers count: 3
Negative numbers count: 2*/