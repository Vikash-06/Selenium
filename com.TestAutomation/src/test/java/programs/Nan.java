package programs;

public class Nan {
	//program no. 21

	public static void main(String[] args) {
		//System.out.println(2/0);
		System.out.println(2.0/0);
		System.out.println(0.0/0.0); //Nan (Not a Number or Undefined Number)
        System.out.println(Float.NaN==Float.NaN); //false
        System.out.println(Float.NaN !=Float.NaN); //true
	}

}
