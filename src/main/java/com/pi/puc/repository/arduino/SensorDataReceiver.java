package com.pi.puc.repository.arduino;

public class SensorDataReceiver {
  private final boolean testMode = true; //true para modo teste ou false hardware físico
  private final SerialCommunication serialCommunication;
  private final SensorDataProcessor dataProcessor;

  public SensorDataReceiver(String portName) {
    this.serialCommunication = new SerialCommunication(portName);
    this.dataProcessor = new SensorDataProcessor();
  }

  public String readData() {
    if (!testMode && !serialCommunication.initialize()) {
      return null;
    }

      String data = testMode ? dataProcessor.generateTestData() : serialCommunication.readData();
      if (data != null) {
        dataProcessor.processSensorData(data);
      }

      return data;
  }

  public void close() {
    if (!testMode) {
      serialCommunication.close();
    }
  }
}