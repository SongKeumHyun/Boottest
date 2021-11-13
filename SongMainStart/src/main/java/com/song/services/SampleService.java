package com.song.services;

import org.springframework.stereotype.Service;

@Service
public class SampleService {
	
	public String getServiceName()
	{
		return this.toString();
	}

}
