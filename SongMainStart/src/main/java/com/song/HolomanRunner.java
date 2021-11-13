package com.song;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.example.Holoman;

@Component
public class HolomanRunner implements ApplicationRunner {

	@Autowired
	Holoman holoman;
	
	@Autowired
	SongProperties songProperties;
	

	@Value("${song.name}")
	private String name;
	
	@Autowired
	private Environment environment;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("사용자 플로퍼티 만들어서 가져오기 " + songProperties.toString());
		
		System.out.println("환경변수에서 온값 " + environment.getProperty("song.name").toString());
		
		System.out.println("++++++++++" + holoman.toString());
		
		System.out.println("프로퍼티에서 가져 온값 " + name);
		

		
		
	}

}
