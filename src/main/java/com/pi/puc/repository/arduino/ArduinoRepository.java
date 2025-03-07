package com.pi.puc.repository.arduino;

import com.pi.puc.model.SensorDataModel;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class ArduinoRepository implements  ArduinoInterface {
  @Override
  public SensorDataModel getAllAttributesFromArduino() {
    SensorDataModel result =  new SensorDataModel();
    result.setLuminosidade(100);
    result.setUmidade(100);
    result.setTemperatura(100);

    return result;
  }

}
