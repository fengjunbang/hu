package com.fengjunbang.fbs.service.Impl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.fengjunbang.fbs.service.RandomService;

@Service("randomService")
public class RandomServiceImpl implements RandomService {

	public String random() {
		String string = UUID.randomUUID().toString();
		
		String string2 = string.substring(0, 16);
	
		return string2;
	}

}
