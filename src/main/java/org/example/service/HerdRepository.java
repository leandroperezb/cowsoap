package org.example.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.example.cows.*;
import org.springframework.stereotype.Component;

@Component
public class HerdRepository {

	private static final Map<String, Herd> herds = new HashMap<>();
	private static long ultimoId = 0;

	@PostConstruct
	public void initData() {
		// initialize herds map
	}
	
	public void newHerd(Herd h) {
		h.setId(String.valueOf(++ultimoId));
		herds.put(h.getId(), h);
	}

	public Herd findHerd(String id) {
		return herds.get(id);
	}
}