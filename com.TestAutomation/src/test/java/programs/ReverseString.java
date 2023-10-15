package programs;

public class ReverseString {
	
	// program no.1  Reverse a string program

	public static void main(String[] args) {
		String s = "Automation";
		
		// first method using for loop
		int len = s.length(); // 10
		String rev = "";

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i); // noi

		}
		System.out.println(rev);
		
//second method using StringBuffer
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());

	}
}

//String is a immutable object that is why we can not use reverse function here while printing
//StringBuffer is a mutable object and we can use reverse function here