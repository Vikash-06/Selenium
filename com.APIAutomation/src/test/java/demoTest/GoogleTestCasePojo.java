package demoTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.BookData;
import pojo.Location;
import pojo.NewPlaceResponse;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GoogleTestCasePojo {
	BookData d = new BookData();

	@BeforeMethod
	public void setup() {
		// https://rahulshettyacademy.com/maps/api/place/add/json?key=qaclick123

	}
//Below is the serializatin concept

	@Test
	public void newmethod() {
		Location l = new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		d.setLocation(l);
		d.setAccuracy(50);
		d.setName("Bomba");
		d.setPhone_number("9838933937");
		d.setAddress("29, side layout, cohen 09");
		List<String> list = new ArrayList<String>();
		list.add("shoe park");
		list.add("shop");

		d.setTypes(list);
		d.setWebsite("http://google.com");
		d.setLanguage("French-IN");

		RequestSpecification respscf = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.addQueryParam("key", "qaclick123").build();

		ResponseSpecification respo = new ResponseSpecBuilder().expectStatusCode(200).build();

		NewPlaceResponse respon = given().log().all().spec(respscf).body(d).when().post("maps/api/place/add/json")
				.then().log().all().assertThat().spec(respo).extract().response().as(NewPlaceResponse.class);
		String placeids = respon.getPlace_id();
		System.out.println(placeids);
		String wow = respon.getScope();
		System.out.println(wow);
		String StatusName = respon.getStatus();
		System.out.println(StatusName);

	}
}