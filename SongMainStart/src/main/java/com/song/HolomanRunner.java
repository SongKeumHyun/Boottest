package com.song;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.Holoman;

@Component
public class HolomanRunner implements ApplicationRunner {

	@Autowired
	Holoman holoman;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("++++++++++" + holoman.toString());
		
	}

}
