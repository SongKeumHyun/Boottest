package com.song.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//@Component
public class Dispatcher {
	
	private Logger logger = LoggerFactory.getLogger(Dispatcher.class);
	
	private long count = 0;
	
	@Scheduled (fixedDelay = 1000)
	public void dippatcher()
	{
		logger.debug("Dispatcher........." + count++);
	}

}
