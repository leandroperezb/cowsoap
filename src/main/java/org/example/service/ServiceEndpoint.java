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
    	cowRepository.storeCow(c);
        response.setCow(c);
        return response;
    }
    
}
