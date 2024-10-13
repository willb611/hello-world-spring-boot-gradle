package com.github.willb611.hellospringbootgradle.api;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ExampleControllerTest {
  @LocalServerPort
  int port;

  @BeforeEach
  public void setup() {
    RestAssured.port = port;
  }

  @Test
  void hello() {
    String response = RestAssured.given()
        .get("/v1/hello")
        .then()
        .statusCode(200)
        .and()
        .extract().body().asString();
    assertEquals("Hello World!", response);
  }
}