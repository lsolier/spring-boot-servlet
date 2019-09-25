package com.example.springboothelloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

  Map<String, Object> result = new HashMap<>();

  @RequestMapping("/hello")
  public Map<String, Object> hello() {
    result.put("name", "Luis Solier");
    result.put("city", "Pucallpa");
    return result;
  }
}
