package com.fatec.projeto.projeto2025.controllers;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioController {


    @GetMapping("/ex5/{idade}")
    public String classificaIdade(@PathVariable int idade){
 
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

    @GetMapping("/ex1/{numero}")
    public String numeroparimpar(@PathVariable int numero){
        if (numero>=0) {
            if (numero % 2 == 0){
                return "par";
            }else{
                return "ímpar";  
            }   
        } else{
            return "Valor inválido";
            
        }
    }

    @GetMapping("/ex2/{peso}/{altura}")
    public String calculadora (@PathVariable double peso, @PathVariable double altura){
        double imc;
        imc = peso / (altura*altura);
        if(imc >=0 ){
            if(imc<=18.5){
                return "abaixo do peso";
            }else if(imc>18.5 &&  imc<=24.9){
                return "peso normal";
            }else if(imc>=25 && imc <=29.9){
                return "sobrepeso";
            }else if(imc>=30 && imc <= 34.9){
                return "obesidade grau 1";
            }else if(imc>=35.0 && imc <=39.0){
            return "obesidade grau 2";
            }else{
                return "obesidade grau 3";
            }
        }else{
            return "valor inválido";
        }
    }
 
    /*@GetMapping ("")
    public String HelloWorld(){
        return "hello";
    }
        */

  /*   @GetMapping ("{nome}")
    public String HelloWorld( @PathVariable Optional <String> nome){
        return nome.isPresent() ? nome.get() : "dd";
    }
        */
    
}

