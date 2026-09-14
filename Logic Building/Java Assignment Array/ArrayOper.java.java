
public class Program {

    public static void main(String[] args) {

        System.out.println("Enter array size:");
        int size = ConsoleInput.getInt();
        
        int[] arr = new int[size];
       
      
        System.out.println("Enter array elements:");

        for (int iTemp = 0; iTemp < arr.length; iTemp++) { 
            arr[iTemp] = ConsoleInput.getInt();
        }

        ArrayOperation operation = new ArrayOperation();
        
        
// 2. Write a Java program to sort an numeric array. The size of the array will be taken from the user, after he specifies the size all the elements of the array will be taken as input and the arryay will be sorted.
        operation.ArrSort(arr);

        System.out.println("Sorted array:");

        for (int iTemp = 0; iTemp < arr.length; iTemp++) {
            System.out.print(arr[iTemp] + " ");
        }
        
        
        
// 3. Modify the exercise 2 and Write a Java program to sum values of an array
        System.out.println("\n\nSum values of array: " + operation.SumArr(arr));
        
// 4. Modify exercise 2 Write a Java program to calculate average value of an array elements       
        System.out.println("\nAverage value of array: " + operation.AvgArr(arr));
        
// 5. .Modify exercise 2 Write a Java program to copy an array by itera ng the array 
        System.out.println("Copy of array:");
        
        int[] copyArray = new int[arr.length];
        operation.EmptyArray(arr, copyArray);

        for (int iTemp = 0; iTemp < arr.length; iTemp++) {
            System.out.print(copyArray[iTemp] + " ");
        }
        
        
 // 6.Modify exercise 2 Write a Java program to find the maximum and minimum value of an array.
    System.out.println("\n\nMaximum value of array: " + operation.Max(arr));
    System.out.println("Minimum value of array: " + operation.Min(arr));
    
 // 7.Modify exercise 2 Write a Java program to reverse an array of integer values
    System.out.println("\nReverse of array: ");
    operation.Reverse(arr);
    
    
 // 8. Modify exercise 2 Write a Java program to find the duplicate values of an array of integer values
    System.out.println();
    operation.Duplicate(arr);
    
    }
}



















public class ArrayOperation {

    public void ArrSort(int[] arr) {

        for (int iTemp = 0; iTemp < arr.length - 1; iTemp++) {

            for (int jTemp = 0; jTemp < arr.length - 1 - iTemp; jTemp++) {

                if (arr[jTemp] > arr[jTemp + 1]) {

                    int temp = arr[jTemp];
                    arr[jTemp] = arr[jTemp + 1];
                    arr[jTemp + 1] = temp;
                }
            }
        }
    }
     
// 3. Modify the exercise 2 and Write a Java program to sum values of an array
    public int SumArr(int[] arr) {
    	int sum = 0;
    	
    	for (int iTemp = 0; iTemp < arr.length; iTemp++) {
    		sum = sum + arr[iTemp];
    	}
    	
    	return sum;
    }
    
// 4. Modify exercise 2 Write a Java program to calculate average value of an array elements
    public int AvgArr(int[] arr) {
    	return SumArr(arr)/arr.length;
    }
    
// 5. Modify exercise 2 Write a Java program to copy an array by itera ng the array   
    public void EmptyArray(int[] arr, int[] copyArray) {
    	
    	for(int iTemp = 0; iTemp < arr.length; iTemp++) {
    		copyArray[iTemp] = arr[iTemp];
    	}
    }
    
// 6.Modify exercise 2 Write a Java program to find the maximum and minimum value of an array.
    public int Max(int[] arr) {
    	int max = arr[0];
    	
    	for (int iTemp = 0; iTemp < arr.length; iTemp++) {
    		if(arr[iTemp] > max) {
    			max = arr[iTemp];
    		}   			
    	}
    	return max;
    }

// Find Minimum
    public int Min(int[] arr) {
    	int min = arr[0];
    	
    	for (int iTemp = 0; iTemp < arr.length; iTemp++) {
    		if(arr[iTemp] < min) {
    			min = arr[iTemp];
    		} 
    	}
    	return min;
    }

// 7.Modify exercise 2 Write a Java program to reverse an array of integer values
    public void Reverse(int[] arr) {
    	for (int iTemp = arr.length - 1; iTemp >= 0 ; iTemp--) {
    	    System.out.print(arr[iTemp] + " ");
    	}
    }
 
// 8.Modify exercise 2 Write a Java program to find the duplicate values of an array of integer values
    public void Duplicate(int[] arr) {
    		
    	for (int iTemp = 0; iTemp < arr.length; iTemp++) {
    		
    		for (int jTemp = iTemp + 1; jTemp < arr.length; jTemp++) {
    		    
    			if(arr[iTemp] == arr[jTemp]) {
    			    
    				System.out.println("Duplicate value: " + arr[iTemp]);
    			    break;
    		    }
    	    }
    	}

    }
    
}






//Console to take Input from User


	public class ConsoleInput{
		public static float getFloat() {
			String objString = getString();
			float data = Float.parseFloat(objString);
			return data;
		}
		
		public static int getInt() {
			return Integer.parseInt(getString());
		}
		
		public static String getString()
		{
			try
			{
				byte arrInput[] = new byte[100]; 
				int length = System.in.read(arrInput);
				byte[] arrFinal = new byte[length - 2];
				
				System.arraycopy(arrInput,  0 , arrFinal, 0, length - 2);
				
				String objString = new String(arrFinal);
				return objString;
			} catch(Exception e)
			{
				e.printStackTrace();
			}
			return null;
		}
	}



