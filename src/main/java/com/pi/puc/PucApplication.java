package com.pi.puc;

import com.pi.puc.repository.arduino.ArduinoRepository;
import com.pi.puc.service.GetArduinoData;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;


@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableScheduling
public class PucApplication {
	@Autowired
	private GetArduinoData getArduinoData;

	public static void main(String[] args) {
		SpringApplication.run(PucApplication.class, args);
	}

	@Scheduled(fixedDelay = 10000)
	public void startLoop() throws InterruptedException {
		getArduinoData.getAndPersistArduinoData();
	}

}
