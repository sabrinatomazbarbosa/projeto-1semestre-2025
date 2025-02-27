package com.fatec.projeto.projeto2025;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
public class Projeto2025Application {

	public static void main(String[] args) {
		SpringApplication.run(Projeto2025Application.class, args);
	}

	
	@GetMapping("{idade}")
   
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

	

}
