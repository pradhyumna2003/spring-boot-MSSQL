package com.rqcapi.rqcapp;

import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RQCApplication {
	public static void main(String[] args) {
		TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
		SpringApplication.run(RQCApplication.class, args);
	}
}
