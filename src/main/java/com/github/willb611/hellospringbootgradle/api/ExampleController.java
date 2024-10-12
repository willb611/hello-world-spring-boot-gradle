package com.github.willb611.hellospringbootgradle.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
  public static final String V1_HELLO_API_PATH = "/v1/hello";

  @GetMapping(value = V1_HELLO_API_PATH, produces = MediaType.TEXT_PLAIN_VALUE)
  public String hello() {
    return "Hello World!";
  }
}
