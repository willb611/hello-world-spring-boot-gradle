package com.github.willb611.hellospringbootgradle.api;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class DefaultController {

  @GetMapping("/")
  public void hello(HttpServletResponse response) throws IOException {
    response.sendRedirect(ExampleController.V1_HELLO_API_PATH);
  }
}
