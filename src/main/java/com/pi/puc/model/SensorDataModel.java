package com.pi.puc.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;


@Entity
@Data
@Table(name = "sensor")
public class SensorDataModel {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Column
  private double temperatura;

  @Column
  private double umidade;

  @Column
  private double luminosidade;

  @Column(name = "creation_timestamp", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
  @Temporal(TemporalType.TIMESTAMP)
  private Timestamp creationTimestamp;
}