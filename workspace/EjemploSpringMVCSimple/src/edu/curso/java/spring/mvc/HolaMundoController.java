package edu.curso.java.spring.mvc;

import org.springframework.ui.Model;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value="/holamundo")

public class HolaMundoController {
	
	//   /holamundo/saludar1.html
	@RequestMapping(value="/saludar1", method = RequestMethod.GET)
	public String saludar(Model model){
		model.addAttribute("texto", "Hola mundo Spring MVC");
		return null;
		//return "/holamundo/saludar1";
	}
	
	
	
//  /holamundo/saludar2.html?textoInicial=jajapepe&idPersona=3
	@RequestMapping(value="/saludar2", method = RequestMethod.GET)
	public String saludar2(@RequestParam String textoInicial, @RequestParam Long idPersona, Model model){
		model.addAttribute("texto", "Hola mundo Spring MVC" + textoInicial + " ID "+ idPersona);
		return "/holamundo/saludar1";
	}
	
		
//  /holamundo/saludar3.html
	@RequestMapping(value="/saludar3", method = RequestMethod.GET)
	public String saludar3(Model model){
		model.addAttribute("texto", "No pasa nada");
		System.out.println("ejecuta Saludar3");
		return "redirect:/holamundo/saludar1.html";
	}
	
	// --- /holamundo/saludar4/juan/perez.html
	@RequestMapping(value="/saludar4/{nombre}/{apellido}", method = RequestMethod.GET)
	public String saludar2(@PathVariable String nombre, @PathVariable String apellido, Model model){
		model.addAttribute("texto", "Hola mundo Spring MVC" + nombre + "  "+ apellido);
		return "/holamundo/saludar1";
	}
	
}