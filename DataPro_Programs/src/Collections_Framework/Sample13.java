// Arrays class Demo

package Collections_Framework;

import java.util.Arrays;

public class Sample13 {

	public static void main(String[] args) {
		
		int[] arr1 = {23,64,46,672,57,278,909,82};
		String[] arr2 = {"Microsoft","Google","Oracle","Accenture","Infosys"};
		double arr3[] = {4.6,2.7,26.7,34.2};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		
		System.out.println("Integer array: ");
		for(int x: arr1)
			System.out.println(x);
		
		System.out.println("\nString array: ");
		for(String x: arr2)
			System.out.println(x);
		
		System.out.println("\nDouble array: ");
		for(double x: arr3)
			System.out.println(x);

	}

}
