package org.example.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.example.cows.*;
import org.springframework.stereotype.Component;

@Component
public class HerdRepository {

	private static final Map<String, Herd> herds = new HashMap<>();

	@PostConstruct
	public void initData() {
		// initialize herds map
	}
	
	public void storeHerd(Herd h) {
		herds.put(h.getId(), h);
	}

	public Herd findHerd(String id) {
		return herds.get(id);
	}
}