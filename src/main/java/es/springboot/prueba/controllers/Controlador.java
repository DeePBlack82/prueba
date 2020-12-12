package es.springboot.prueba.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class Controlador {

	@GetMapping(path="/login")
	public String inicio() {
		
		return "index";
	
	}
	
	@GetMapping(path="/form")
	public String formulario() {
		
		return "formulario";
		
	}
	
}
