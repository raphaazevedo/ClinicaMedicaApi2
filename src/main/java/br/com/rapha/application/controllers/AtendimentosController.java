package br.com.rapha.application.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/atendimentos")
public class AtendimentosController {
	
	@PostMapping("criar")
	public void criar() {
		
	}
	
	@GetMapping("consultar")
	public void consultar() {
		
	}

}
