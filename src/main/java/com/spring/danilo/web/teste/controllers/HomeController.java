package com.spring.danilo.web.teste.controllers;

import java.util.ArrayList;
import java.util.List;

import com.spring.danilo.web.teste.models.Cliente;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @GetMapping("/")
    @RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {
        var cliente = new Cliente();
        cliente.setNome("Danilo");
        
        model.addAttribute("cliente", cliente);
        model.addAttribute("obs", "- Rosi e danilo - ");

		return "home/index";
	}

    @GetMapping("/direitos")
	public String direitos() {
		return "home/direitos";
	}
}