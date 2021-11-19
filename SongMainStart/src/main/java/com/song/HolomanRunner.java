package com.song;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.example.Holoman;
import com.song.communications.TibDriver;
import com.song.scheduler.Dispatcher;
import com.song.services.SampleService;


@Component
public class HolomanRunner implements ApplicationRunner {

	@Autowired
	Holoman holoman;
	
	@Autowired
	SongProperties songProperties;
	
	//@Autowired
	Dispatcher dispatcher;
	

	@Value("${song.name}")
	private String name;
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private SampleService sampleService;
	
	@Autowired
	private TibDriver tibDriver;
	
	
	private Logger logger = LoggerFactory.getLogger(HolomanRunner.class);
		

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		logger.debug("=================================================");
		
		logger.debug("Tib Test" + tibDriver.getTibConfigration().toString());
		
		
		
		
		
		
		
		logger.debug("=================================================");
		logger.debug("사용자 플로퍼티 만들어서 가져오기 " + songProperties.toString());
		
		logger.debug("환경변수에서 온값 " + environment.getProperty("song.name").toString());
		
		logger.debug("++++++++++" + holoman.toString());
		
		logger.debug("프로퍼티에서 가져 온값 " + name);
		

		logger.info("-----"  + sampleService.toString() );
		
	}

}
