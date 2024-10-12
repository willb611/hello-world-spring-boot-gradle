package com.github.willb611.hellospringbootgradle.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleAPI {

  @RequestMapping(value = "/v1/hello", produces = MediaType.TEXT_PLAIN_VALUE)
  public String hello() {
    return "Hello World!";
  }
}
