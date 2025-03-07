package com.pi.puc.service;

import com.pi.puc.repository.internalDatabase.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SensorService {
  @Autowired
  private SensorRepository repository;


}
