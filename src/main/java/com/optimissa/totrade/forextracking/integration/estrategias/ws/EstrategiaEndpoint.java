package com.optimissa.totrade.forextracking.integration.estrategias.ws;

import com.optimissa.totrade.forextracking.integration.estrategias.GetEstrategiasRequest;
import com.optimissa.totrade.forextracking.integration.estrategias.GetEstrategiasResponse;
import com.optimissa.totrade.forextracking.integration.estrategias.TG7066O;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * 
 * @author Aarón Delgado
 *
 */
@Endpoint
public class EstrategiaEndpoint {
	@PayloadRoot(namespace = "http://integration.forextracking.totrade.optimissa.com/estrategias", localPart = "GetEstrategiasRequest")
	@ResponsePayload
	public GetEstrategiasResponse processCourseDetailsRequest(@RequestPayload GetEstrategiasRequest request) {
		GetEstrategiasResponse response = new GetEstrategiasResponse();		
                TG7066O  tg70661= new TG7066O();
                tg70661.setCodretorno("233432");
                tg70661.setNomestr("1");
                response.setTg7066O(tg70661);
		return response;
	}
}