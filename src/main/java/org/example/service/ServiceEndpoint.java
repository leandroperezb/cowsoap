package org.example.service;

import org.example.cows.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ServiceEndpoint {
	private static final String NAMESPACE_URI = "http://www.example.org/cows/";
	
	private CowRepository cowRepository;
	private HerdRepository herdRepository;
	 
    @Autowired
    public ServiceEndpoint(CowRepository countryRepository, HerdRepository herdRepository) {
        this.cowRepository = countryRepository;
        this.herdRepository = herdRepository;
    }
 
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCowRequest")
    @ResponsePayload
    public GetCowResponse getCow(@RequestPayload GetCowRequest request) {
        GetCowResponse response = new GetCowResponse();
        response.setCow(cowRepository.findCow(request.getCow().getId()));
        return response;
    }
    
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createCowRequest")
    @ResponsePayload
    public CreateCowResponse createCow(@RequestPayload CreateCowRequest request) {
    	CreateCowResponse response = new CreateCowResponse();
    	Cow c = request.getCow();
    	cowRepository.newCow(c);
        response.setCow(c);
        return response;
    }
    
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getHerdRequest")
    @ResponsePayload
    public GetHerdResponse getHerd(@RequestPayload GetHerdRequest request) {
    	GetHerdResponse response = new GetHerdResponse();
        response.setHerd(herdRepository.findHerd(request.getHerd().getId()));
        return response;
    }
    
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createHerdRequest")
    @ResponsePayload
    public CreateHerdResponse createCow(@RequestPayload CreateHerdRequest request) {
    	CreateHerdResponse response = new CreateHerdResponse();
    	Herd h = request.getHerd();
    	herdRepository.newHerd(h);
        response.setHerd(h);
        return response;
    }
    
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addCowToHerdRequest")
    @ResponsePayload
    public AddCowToHerdResponse createCow(@RequestPayload AddCowToHerdRequest request) {
    	AddCowToHerdResponse response = new AddCowToHerdResponse();
    	CowHerdLink link = request.getLink();
    	Herd h = herdRepository.findHerd(link.getIdherd());
    	Cow c = cowRepository.findCow(link.getIdcow());
        h.getCows().add(c);
        response.setRespuesta(true);
        return response;
    }    
    
    
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getLastBcsRequest")
    @ResponsePayload
    public GetLastBcsResponse createCow(@RequestPayload GetLastBcsRequest request) {
    	GetLastBcsResponse response = new GetLastBcsResponse();
    	response.setBcs(cowRepository.getLastBcs(request.getCow()));
        return response;
    }
}
