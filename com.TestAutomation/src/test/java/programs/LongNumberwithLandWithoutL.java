package programs;

public class LongNumberwithLandWithoutL {
	//Program no. 23
	//Output when print a long numnber with L and without L suffix in java

	public static void main(String[] args) {
		long longnumberwithoutL = 1000*60*60*24*365;
		long longnumberwithL = 1000*60*60*24*365L;
		System.out.println(longnumberwithoutL); //1471228928 (max 32 bit supported)
		System.out.println(longnumberwithL); //31536000000 (36-bits)
		//jave supports only 32 bits

	}

}
