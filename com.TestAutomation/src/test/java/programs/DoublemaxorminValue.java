package programs;

public class DoublemaxorminValue {

	public static void main(String[] args) {
		/*
		 * Program no. 24
		 * what is the value of double MIN_VALUE?
		 * which one is bigger --> Double MIN_VALUE or 0.0d?
		 * whcih one is bigger --> Double MIN_VALUE or NEGATIVE INFINITY
		 */
  System.out.println(Double.MIN_VALUE); //+ve value
  System.out.println(Integer.MIN_VALUE); // -ve value
  System.out.println(Long.MIN_VALUE); // -ve value
  System.out.println(Math.min(Double.MIN_VALUE, 0.0d)); //0.0
  System.out.println(Math.min(Integer.MIN_VALUE, 0));
  System.out.println(Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY));
  System.out.println(Float.MIN_VALUE); //=ve value
	}

}
