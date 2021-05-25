package br.org.generation.objetivosAprendizagem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ObjetivosAprendizagemController {

	@GetMapping("/Obj")
	public String objetivosAprendizagem() {
		
		return "Meu objetivo de aprendizagem pra essa pra essa semana é: \nAprender o Srping Boot e conseguir me desenvolver cada vez mais.";
	}
}
