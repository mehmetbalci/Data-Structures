import java.util.Arrays;
public class SimpleArrays {

		public static void main(String[] args) {
			//Static Arrays
			int[] numbers= {11,2,3,44,35,16,27};
			Arrays.sort(numbers);
			//find the element in an array
			Arrays.binarySearch(numbers, 16);
			String[] names= {"John","Teddy","James","Kevin","Lisa"};
			//Dynamic Arrays
			//assigning the values in runtime
			int[] oldItems = new int[10];
			for (int i = 0; i < 10; i++) {
			    oldItems[i] = i + 10;
			}
			int[] newItems = new int[20];
			System.arraycopy(oldItems, 0, newItems, 0, 10);
			oldItems = newItems;
			
			//Anonymous Arrays
			System.out.println(new int[] {1,2,3,4,5}.length);
			
			//Both of these are legal declarations
			int arr1[];
			int[] arr2;
			
			//You can assing diffrent sized arrays to each if and only if their types are same
			int[] a = new int[10];
	        int[] b = new int[100];
	        a = b;      //Compiler checks only type, not the size
	        
	        //Jagged Arrays
	      //One Dimensional Array of lenghth 3
	        int[] OneDimensionalArray1 = {1, 2, 3};
	        //One Dimensional Array of lenghth 4
	        int[] oneDimensionalArray2 = {4, 5, 6, 7};
	        //One Dimensional Array of lenghth 5
	        int[] oneDimensionalArray3 = {8, 9, 10, 11, 12};
	        //Jagged Two Dimensional Array
	        int[][] jaggedArray = {OneDimensionalArray1, oneDimensionalArray2, oneDimensionalArray3};
	        //Printing elements of Two Dimensional Array
	        for (int i = 0; i < jaggedArray.length; i++)
	        {
	            for (int j = 0; j < jaggedArray[i].length; j++)
	            {System.out.print(jaggedArray[i][j]+"\t");
	            }System.out.println();
	        }
	        
	      //2D Arrays Declaration Styles
	        
	        int[][] twoDArray1;
	                 
	        int twoDArray2[][];
	                 
	        int[] twoDArray3[];
		}

	}
