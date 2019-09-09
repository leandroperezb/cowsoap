package org.example.cows;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class CowRepository {

	//private static final Map<String, Cow> countries = new HashMap<>();

	@PostConstruct
	public void initData() {
		// initialize countries map
	}

	public Cow findCow(String id) {
		Cow retorno = new Cow();
		retorno.setElectronicId("hola");
		retorno.setPeso(596f);
		retorno.setId(id);
		return retorno;
	}
}