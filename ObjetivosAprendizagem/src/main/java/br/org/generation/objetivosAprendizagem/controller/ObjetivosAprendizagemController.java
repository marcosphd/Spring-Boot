package br.org.generation.objetivosAprendizagem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ObjetivosAprendizagemController {

	@GetMapping("/Obj")
	public String objetivosAprendizagem() {
		
		return "Hablidades: Atenção aos Detalhes \nMentaliades: Persistencia e Mentalidade de Crecimento";
	}
}
