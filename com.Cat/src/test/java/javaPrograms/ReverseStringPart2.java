package javaPrograms;

public class ReverseStringPart2 {

	public static void main(String[] args) {
		String s = "Automation Testing Machine";
		String rev = "";
		String[] ary = s.split(" ");
		int l = ary.length;
		for (int i = l - 1; i >= 0; i--) {
			rev = rev + " " + ary[i];
		}
		System.out.println(rev);

	}

}
