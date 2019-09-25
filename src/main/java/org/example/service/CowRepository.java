package org.example.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.example.cows.Cow;
import org.springframework.stereotype.Component;

@Component
public class CowRepository {

	private static final Map<String, Cow> cows = new HashMap<>();
	private static long ultimoId = 0;

	@PostConstruct
	public void initData() {
		// initialize cows map
	}
	
	public void storeCow(Cow c) {
		c.setId(String.valueOf(++ultimoId));
		cows.put(c.getId(), c);
	}

	public Cow findCow(String id) {
		return cows.get(id);
	}
}