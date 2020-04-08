// Reading / Printing matrix elements

package ControlStructures_Arrays_Strings_WrapperClasses;

import java.util.Scanner;

public class Sample16 {

	public static void main(String[] args) {
		
		int i,j;
		int m[][] = new int[3][];
		m[0] = new int[5];
		m[1] = new int[3];
		m[2] = new int[4];
		Scanner scan = new Scanner(System.in);
		
		for(i=0;i<m.length;i++)
		{
			System.out.println("Enter elements into a row: ");
			for(j=0;j<m[i].length;j++)
			m[i][j] = scan.nextInt();
		}
		System.out.println("The Matrix is: ");
		for(i=0; i<m.length;i++)
		{
			for(j=0;j<m[i].length;j++)
				System.out.printf("%8d", m[i][j]);
			
		System.out.println();
		}
		System.out.println();
	}


}
