package com.planotatico.digimon.digimon.client;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.planotatico.digimon.digimon.client.domain.Digimon;

public class DigimonClient {

    public List<Digimon> listar() {
		RestTemplate restTemplate = new RestTemplate();
		
		RequestEntity<Void> request = RequestEntity
				.get(URI.create("https://digimon-api.vercel.app/api/digimon"))
				.header("Authorization", "Basic YWxnYXdvcmtzOnMzbmg0").build();
		
		ResponseEntity<Digimon[]> response = restTemplate.exchange(request, Digimon[].class);
		
		return Arrays.asList(response.getBody());
	}
	
	public String salvar(Digimon digimon) {
		RestTemplate restTemplate = new RestTemplate();
		
		RequestEntity<Digimon> request = RequestEntity
				.post(URI.create("https://digimon-api.vercel.app/api/digimon"))
				.header("Authorization", "Basic YWxnYXdvcmtzOnMzbmg0")
				.body(digimon);
		
		ResponseEntity<Void> response = restTemplate.exchange(request, Void.class);

		return response.getHeaders().getLocation().toString();
		
	
	}
    
}
