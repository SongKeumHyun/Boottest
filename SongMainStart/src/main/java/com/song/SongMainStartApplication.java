package com.song;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling
@SpringBootApplication
public class SongMainStartApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(SongMainStartApplication.class, args);

		
	}

}
