package com.ama.springdemoannotations;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "this is a bad journey!!! :'(";
	}

}
