package com.optativa.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class Controlador {

    private final ThymeleafApplication thymeleafApplication;

    Controlador(ThymeleafApplication thymeleafApplication) {
        this.thymeleafApplication = thymeleafApplication;
    }

	@GetMapping("/saluda")
	public String saludo(Model modelo) {
		System.out.println("#####  Entra en /saluda");
		String name = "Manuel";
		modelo.addAttribute("nombre", name);
		
		return "saludo";
	}
}
