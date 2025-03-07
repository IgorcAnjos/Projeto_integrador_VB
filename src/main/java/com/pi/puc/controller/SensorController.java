package com.pi.puc.controller;

import com.pi.puc.model.SensorDataModel;
import com.pi.puc.repository.internalDatabase.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/sensor")
public class SensorController {
  @Autowired
  SensorRepository sensorRepository;

  @GetMapping("/getAllAtributeSensor")
  public SensorDataModel getAllAttributeSensor() {
    return null;
  }
}
