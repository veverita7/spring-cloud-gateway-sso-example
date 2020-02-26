package io.github.veverita7.simplesso.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
  @GetMapping("/")
  public String getHelloWorld() {
    return "Hello, world";
  }
}
