/*1
  2*2
  3*3*3
  4*4*4*4
  5*5*5*5*5
  5*5*5*5*5
  4*4*4*4
  3*3*3
  2*2
  1*/


class StarNum1{
public static void main(String[]args){
for (int i=1; i<=5; i++) {           //Rows and Number
   for (int j = 1; j <= i; j++) {    //How many times Number is printed
       if (j == 1) {                 //Print no without star
          System.out.print(i);
           } 
      else {
            System.out.print("*" + i);
            }
            }
            System.out.println();   // Move to next line
        }
for (int i = 5; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print(i);
                } 
     else {
                    System.out.print("*" + i);
                }
            }
            System.out.println();
        }
    }
}