package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HolomanConfiguration {

	@Bean
	public Holoman holoman()
	{
		Holoman holoman = new Holoman();
		holoman.setHowlong(5);
		holoman.setName("Song");
		return holoman;
	}
}
