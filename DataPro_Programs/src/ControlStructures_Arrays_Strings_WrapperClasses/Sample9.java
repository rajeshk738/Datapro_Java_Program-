// Labeled break example 3

package ControlStructures_Arrays_Strings_WrapperClasses;

public class Sample9 {

	public static void main(String[] args) {
		
		int i,j;
		LOOP1:
			for(i=1;i<=10;i++)
			{
				System.out.println(i);
			}
		LOOP2:
			for(j=1;j<=20;j++)
			{
				if(j==5)
		//			break LOOP1;   // ----> cannot use the LOOP1 to break
				System.out.println(j);
			}

	}

}
