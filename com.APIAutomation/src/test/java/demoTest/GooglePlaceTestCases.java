package demoTest;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import payload.RequestPayLoad;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GooglePlaceTestCases {
	Workbook book;

	String placeID;

	@BeforeMethod
	public void setup() {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
	}

	@DataProvider(name = "userdata")
	public Object[][] getdata() {
		try {
			FileInputStream file = new FileInputStream(
					"C:\\Users\\User\\Desktop\\Code panda\\Vuse Web\\com.Vuse\\com.APIAutomation\\TestDataA\\userdata.xlsx");
			try {
				book = WorkbookFactory.create(file);
			} catch (EncryptedDocumentException | IOException e) {

				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Sheet sheet = book.getSheetAt(0);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {

				data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
			}
		}
		return data;

	}

	@Test(priority = 0, description = "create a place data on server", invocationCount = 1, groups = "Smoke", dataProvider = "userdata")
	public void AddPlaceTest(String name, String address) {

		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "text/plain")
				.body(RequestPayLoad.placePayload(name, address)).when().post("maps/api/place/add/json").then().log()
				.all().assertThat().statusCode(200).header("Server", "Apache/2.4.41 (Ubuntu)")
				.body("scope", equalTo("APP")).extract().response().asString();

		JsonPath js = new JsonPath(response);
		placeID = js.getString("place_id");
		System.out.println(placeID);
		String statusvalue = js.getString("status");
		assertEquals("OK", statusvalue);

	}

	@Test(priority = 1, description = "fetch a place data from server", invocationCount = 1, groups = "Smoke", enabled = true)
	public void getplaceTest() {

		String res = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeID).when()
				.get("maps/api/place/get/json").then().log().all().assertThat().statusCode(200).extract().response()
				.asString();
		JsonPath js = new JsonPath(res);

		String languagename = js.getString("language");
		assertEquals("French-IN", languagename);

	}

	@Test(priority = 2, description = "update existing place data on server", invocationCount = 1, groups = "Smoke", enabled = false)
	public void putplaceTest() {
		Response updateresponse = given().log().all().queryParam("key", "qaclick123")
				.header("Content-Type", "text/plain")
				.body("{\r\n" + "\"place_id\":\"" + placeID + "\",\r\n"
						+ "\"address\":\"08, side layout, cohen 09\",\r\n" + "\"key\":\"qaclick123\"\r\n" + "}")
				.when().put("maps/api/place/update/json").then().log().all().assertThat()
				.header("Server", "Apache/2.4.41 (Ubuntu)").statusCode(200)
				.body("msg", equalTo("Address successfully updated")).extract().response();
		long resTime = updateresponse.getTime();
		System.out.println(resTime);
		int statuscodevalue = updateresponse.getStatusCode();
		assertEquals(200, statuscodevalue);

	}

	@Test(priority = 3, description = "deleting place data from server", invocationCount = 1, groups = "Smoke", enabled = false)
	public void DeleteplaceTest() {
		String rps = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "text/plain")
				.body("{\r\n" + "\r\n" + "    \"place_id\":\"" + placeID + "\"\r\n" + "}").when()
				.delete("maps/api/place/delete/json").then().log().all().assertThat().statusCode(200).extract()
				.response().asString();

		JsonPath js = new JsonPath(rps);
		String statustype = js.getString("status");
		assertEquals("OK", statustype);

	}

}
