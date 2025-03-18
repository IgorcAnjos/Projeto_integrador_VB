package com.pi.puc.repository.arduino;

import com.pi.puc.model.SensorDataModel;
import org.springframework.stereotype.Repository;

import java.util.UUID;

import com.fazecast.jSerialComm.SerialPort;
import com.fazecast.jSerialComm.SerialPortDataListener;
import com.fazecast.jSerialComm.SerialPortEvent;

@Repository
public class ArduinoRepository implements  ArduinoInterface {

  private SensorDataReceiver arduinoReceiver;

  public ArduinoRepository(String portName) {
    arduinoReceiver = new SensorDataReceiver(portName);
  }
  @Override
  public SensorDataModel getAllAttributesFromArduino() {

    String allAttributesStringFlat = arduinoReceiver.readData();
    System.out.println("AQUI É A REPOSITORY");
    System.out.println(allAttributesStringFlat);

    SensorDataModel result =  new SensorDataModel();
    result.setLuminosidade(100);
    result.setUmidade(100);
    result.setTemperatura(100);

    return result;
  }


}
