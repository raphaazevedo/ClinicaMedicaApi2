package br.com.rapha.application.controllers;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/pacientes")
public class PacientesController {
	
	@PostMapping("criar")
	public void criar() {
		
	}
	
	@GetMapping("consultar")
	public void consultar() {
		
	}
	
	@GetMapping("obter/{id}")
	public void obter(@PathVariable("id") UUID id) {
		
	}

}
