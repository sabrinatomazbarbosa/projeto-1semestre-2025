package com.fatec.projeto.projeto2025.controllers;

//import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioController {
    /*@GetMapping ("")
    public String HelloWorld(){
        return "hello";
    }

    @GetMapping ("{nome}")
    public String HelloWorld( @PathVariable Optional <String> nome){
        return nome.isPresent() ? nome.get() : "dd";
    }*/

// @GetMapping("/get-idade/{idade}")
//public String classificaIdade( integer idade){


   @GetMapping("{idade}")

    public String classificaIdade(@PathVariable int idade){
        /*poderia ser 
        try{
        if(idade<0){
        throw new NumberFormatException();
        }
        if (idade<12) {
        return "Criança";
        }else if (idade>=12 && idade<18){
        return "Adolescente";
        }else if (idade =18 && idade<60){
        return "Adulto";
        }else{
        return "Idoso";
        }


        } 
        catch(Exception e){
        return "Idade inválida"
        }



        */
        if (idade > 0 && idade < 12){
            return "Criança";
        }else if(idade >= 12 && idade <=18){
            return "Adolescente";
        }else if(idade >= 19 && idade <= 60){
            return "Adulto";
        }else if(idade > 60){
            return "Idoso";
        }else{
            return "Idade inválida";
        }
 
    }
    
}
