package com.esn.api.estocknotifier_service;

import org.springframework.boot.SpringApplication;

public class TestEstocknotifierServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(Application::main).with(TestcontainersConfiguration.class).run(args);
	}

}
