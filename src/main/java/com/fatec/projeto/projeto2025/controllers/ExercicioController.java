package com.fatec.projeto.projeto2025.controllers;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioController {
    @GetMapping ("")
    public String HelloWorld(){
        return "hello";
    }

    @GetMapping ("{nome}")
    public String HelloWorld( @PathVariable Optional <String> nome){
        return nome.isPresent() ? nome.get() : "dd";
    }
    
}
