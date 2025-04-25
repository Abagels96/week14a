package com.coderscampus.week14a.alphaAdvantage;

import java.net.URI;

import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.week14a.DTO.AlphaAdvantageResponse;

public class AlphaAdvantageIntegration {
@Test
	@SuppressWarnings("deprecation")
	public void callApiExample() {
		
		RestTemplate rt = new RestTemplate();
		
	URI uri=	UriComponentsBuilder.fromHttpUrl("https://www.alphavantage.co/query")
		                    .queryParam("function","TIME_SERIES_DAILY_ADJUSTED")
		                    .queryParam("symbol", "IBM")
		                    .queryParam("apikey", "demo")
		                    .build()
		                    .toUri();
		
	ResponseEntity<AlphaAdvantageResponse> response=	rt.getForEntity(uri, AlphaAdvantageResponse.class);
	System.out.println(response.getBody());
		
		
	}

}
