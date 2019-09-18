package org.example.cows;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class HerdRepository {

	//private static final Map<String, Cow> countries = new HashMap<>();

	@PostConstruct
	public void initData() {
		// initialize countries map
	}

	public Herd findHerd(String id) {
		Herd retorno = new Herd();
		retorno.setId(id);
		retorno.setNombre("asd");
		Cow a = new Cow();
		a.setId("hola");
		Cow b = new Cow();
		b.setId("chau");
		retorno.getCows().add(a);
		retorno.getCows().add(b);
		return retorno;
	}
}
