package br.com.diógenesjardim.refac.suite;

import org.junit.BeforeClass;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;

public class SetupTest {
	

		 
		 @BeforeClass
		 public static void setup() {
			 RestAssured.baseURI = "http://localhost";
			 RestAssured.port = 3000;
	         RestAssured.basePath = "/api";
	         
	         RestAssured.requestSpecification = new RequestSpecBuilder()
	        		 .setContentType(ContentType.JSON)
	        		 .build();
			
		}

	}
