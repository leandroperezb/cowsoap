package org.example.cows;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CowEndpoint {
	private static final String NAMESPACE_URI = "http://www.example.org/cows/";
	
	private CowRepository cowRepository;
	 
    @Autowired
    public CowEndpoint(CowRepository countryRepository) {
        this.cowRepository = countryRepository;
    }
 
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCowRequest")
    @ResponsePayload
    public GetCowResponse getCow(@RequestPayload GetCowRequest request) {
        GetCowResponse response = new GetCowResponse();
        response.setCow(cowRepository.findCow(request.getCow().getId()));
        return response;
    }
}
