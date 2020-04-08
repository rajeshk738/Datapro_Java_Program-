// Demo on compareTo()

package ControlStructures_Arrays_Strings_WrapperClasses;

public class Sample20 {

	public static void main(String[] args) {

		String[] strArr = {"Vizag", "Hyderabd", "Vijayawada","Rajahmundry","Warangal"};
		String temp;
		
		int n = 5;
		int i,j;
		
		for(i=0; i<n-1;i++)
		{
			for(j=0; j<n-1;j++)
			{
				
				if(strArr[j].compareTo(strArr[j+1])>0)
				{
					temp = strArr[j];
					strArr[j] = strArr[j+1];
					strArr[j+1] = temp;
				}
				
			}
		}
	System.out.println("In alphabetical order:");
	
	for(String x: strArr)
		System.out.println(x);
	}

}
