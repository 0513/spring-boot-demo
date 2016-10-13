package com.tobebetter.test;

import org.junit.Before;
import org.junit.Test;

import com.jayway.restassured.RestAssured;

import static com.jayway.restassured.RestAssured.*;
import static com.jayway.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class UserTest {
	@Before
	public void setUP() {
		// 指定 URL 和端口号
		RestAssured.baseURI = "http://localhost:8080/v1/users";
		RestAssured.port = 8080;
	}

	@Test
	public void testGETBook() {
		get("/").then().body("[0].id", equalTo("user1"));
	}
}
