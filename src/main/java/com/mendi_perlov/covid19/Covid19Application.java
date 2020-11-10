package com.mendi_perlov.covid19;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;




@SpringBootApplication
public class Covid19Application {

	public static void main(String[] args) {
		SpringApplication.run(Covid19Application.class, args);
		System.out.println("go");
		System.out.println(LocalDate.now());

	}
	

}
