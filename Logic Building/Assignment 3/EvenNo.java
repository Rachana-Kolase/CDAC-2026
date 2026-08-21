//Program to print Even numbers from 1-50

class EvenNo{
  int PrintEvenNumbers(){
  int i=1;
while(i<=50){
    if(i%2 == 0){
       System.out.println(i);
     }
     i++;
    }
  return i;
  }

public static void main(String[]args)
{
 
     EvenNo obj=new EvenNo();
     obj.PrintEvenNumbers();
    
        }
 }







/*Output:
2
4
6
8
10
12
14
16
18
20
22
24
26
28
30
32
34
36
38
40
42
44
46
48
50*/