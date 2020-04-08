// Labeled break example 1

package ControlStructures_Arrays_Strings_WrapperClasses;

public class Sample7 {

	public static void main(String[] args) {

		int i,j,k;
		LOOP1:
			for(i=1;i<=3;i++)
			{
				LOOP2:
				for(j=1;j<=3;j++)
				{
					LOOP3:
						for(k=1;k<=3;k++)
						{
							if(i==2 && j==2 && k==2)
								break LOOP1;
							System.out.println(i+","+j+","+k);
						}
				}
			}

	}

}
