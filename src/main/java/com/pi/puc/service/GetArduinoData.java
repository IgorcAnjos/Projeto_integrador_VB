package com.pi.puc.service;

import com.pi.puc.model.SensorDataModel;
import com.pi.puc.repository.arduino.ArduinoRepository;
import com.pi.puc.repository.internalDatabase.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GetArduinoData {
  @Autowired
  private SensorRepository sensorRepository;

  @Autowired
  private ArduinoRepository arduinoRepository;

  public void getAndPersistArduinoData() {
    SensorDataModel sensorData = arduinoRepository.getAllAttributesFromArduino();
    System.out.println(sensorData);
    sensorRepository.save(sensorData);
  }
}
