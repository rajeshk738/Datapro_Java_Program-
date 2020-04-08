// To prove that strings are passed by value

package Introduction_Java_Programming;

class Sample15{
	void fun(String t)
	{
		t = "Bye";
	
	}

	public static void main(String[] args) {
		String s = "Hai";
		new Sample15().fun(s);
		System.out.println(s);
		
	}

}
