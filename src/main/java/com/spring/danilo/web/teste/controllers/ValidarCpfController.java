package com.spring.danilo.web.teste.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ValidarCpfController {
	@GetMapping("/validar-cpf")
	public String index() {
		return "validarCpf/index";
	}

	@PostMapping("/validar-cpf/validar")
	public String validar() {
		return "validarCpf/index";
	}
}