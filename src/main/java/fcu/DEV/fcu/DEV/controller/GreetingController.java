package fcu.DEV.fcu.DEV.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * class of greeting controller.
 */
@RestController
public class GreetingController {
  @GetMapping("/greeting")
    public String sayHello(@RequestParam String name) {

     return "Hello " + name;
  }
}
