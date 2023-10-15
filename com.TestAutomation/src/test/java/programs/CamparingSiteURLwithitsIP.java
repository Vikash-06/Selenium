package programs;

import java.net.MalformedURLException;
import java.net.URL;

public class CamparingSiteURLwithitsIP {
	// program no. 35
	// Comparing wensite URL with its IP address.

	public static void main(String[] args) {
		try {
			System.out.println(new URL("https://www.hubspot.com").equals(new URL("https://172.64.148.142")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
