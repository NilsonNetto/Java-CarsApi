package com.carsapi.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serverstatus")
public class ServerStatus {

  @GetMapping
  public String status() {
    return "Server running";
  }
}
