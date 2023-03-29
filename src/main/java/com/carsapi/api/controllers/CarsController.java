package com.carsapi.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carsapi.api.dto.CarDTO;

@RestController
@RequestMapping("/api/cars")
public class CarsController {

  @PostMapping()
  public void create(@RequestBody CarDTO req) {
    System.out.println(
        "modelo: " + req.modelo() + "(" + req.anoModelo() + "); " + "fabricante: " + req.fabricante());
  }
}
