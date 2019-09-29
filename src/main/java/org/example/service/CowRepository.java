package org.example.service;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.example.cows.Cow;
import org.example.cows.Cowbcs;
import org.springframework.stereotype.Component;

@Component
public class CowRepository {

	private static final Map<String, Cow> cows = new HashMap<>();
	private static long ultimoId = 0;
	private static long ultimoIdBcs = 0;

	@PostConstruct
	public void initData() {
		// initialize cows map
	}
	
	public void newCow(Cow c) {
		c.setId(String.valueOf(++ultimoId));
		cows.put(c.getId(), c);
	}

	public Cow findCow(String id) {
		return cows.get(id);
	}
	
	public Cowbcs getLastBcs(Cow c) {
		Cowbcs respuesta = new Cowbcs();
		respuesta.setCc((float) Math.random() * 5);
		respuesta.setCowId(c.getId());
		respuesta.setId(String.valueOf(++ultimoIdBcs));
		
		GregorianCalendar cal = new GregorianCalendar();
		 
        //Set todays date
        cal.setTime(new Date());
        XMLGregorianCalendar xCal = null;
		try {
			xCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		respuesta.setFecha(xCal);
		
		return respuesta;
	}
}