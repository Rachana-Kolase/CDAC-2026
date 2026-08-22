/* 1
   1*3
   1*3*5
   1*3*5*7
   1*3*5*7*9 */6

public class StarNumber3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int num = 1; // Start with first odd number
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print(num);
                } else {
                    System.out.print("*" + num);
                }
                num += 2; // Jump to next odd number (1 -> 3 -> 5...)
            }
            System.out.println();
        }
    }
}