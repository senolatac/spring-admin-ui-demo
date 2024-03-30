package com.example.demoadminui;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class DemoAdminUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAdminUiApplication.class, args);
	}

}
