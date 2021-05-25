package br.org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Annotation que indica que é uma classe controladora
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hellow World!! \nHablidades: Atenção aos Detalhes \nMentaliades: Persistencia e Mentalidade de Crecimento";	
    }
}
