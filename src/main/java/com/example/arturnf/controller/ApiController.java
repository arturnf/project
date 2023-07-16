package com.example.arturnf.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	
	
	List<String> nomes = new ArrayList<>(Arrays.asList("hz4PCwi", "Ec00jlO", "slDEdEH", "O94BCs4", "lUs54g7", "lDFvrL4", "JjbKNG7", "iNKrM3J", "CvyR07c"));
	
	
	@GetMapping("/imagem")
	public String imgApi() {
		Random random = new Random();
		int indiceAleatorio = random.nextInt(nomes.size());
		String nomeAleatorio = nomes.get(indiceAleatorio);
		String diretorioImagens = "https://i.imgur.com/";
	    String extensaoImagem = ".jpg";
	    
	    
		return diretorioImagens + nomeAleatorio + extensaoImagem;
	}
	
	
}
