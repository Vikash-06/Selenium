package OopConcept;

public class WrapperClassConcept {

	public static void main(String[] args) {
		//Wrapper class is used for conversion
		//Integer, Character, Boolean, Double
		
		//data conversion: string to int
		String name ="300";
		int l = Integer.parseInt(name);
		System.out.println(l);
		
		//data conversion: String to double
		String s1 = "10.05";
		double d = Double.parseDouble(s1);
		System.out.println(d);
		
		//data conversion: String to boolean
		String s2 = "True";
		boolean b = Boolean.parseBoolean(s2);
		System.out.println(b);
		
		//data conversion: int to String
		int age = 40;
		String s3 = String.valueOf(age);
		System.out.println(s3+50);
		
		String s5 = "100A";
		int m = Integer.parseInt(s5);
		System.out.println(m); // throw an exception of "Number format exception"
		
		
		
		
		
		

	}

}
