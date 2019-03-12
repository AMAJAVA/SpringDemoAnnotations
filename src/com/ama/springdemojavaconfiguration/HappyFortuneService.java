package com.ama.springdemojavaconfiguration;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		return "Hi! It's your lucky day";
	}

}
