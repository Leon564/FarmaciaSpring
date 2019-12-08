package com.happypet.Farmacia.controladores;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.happypet.Farmacia.entidades.Cliente;
import com.happypet.Farmacia.repositorio.RepoCliente;



@Controller
public class ClienteController {
	
	@Autowired
	RepoCliente Repo;
	
	//maping nuevo.html
	@GetMapping("/nuevo")
	public String nuevo() {
		return "nuevo";
	}
	
	// Ruta get /editarcliente/{id}
		@GetMapping("/editarcliente/{id}")
		public String editar(@PathVariable("id")int id,Model model) {
			model.addAttribute("Cliente", Repo.findById(id));
			return "editarcliente";
		}
		
		
		// Ruta post /editar
		
		@PostMapping("/actualizarcliente")
		public String actualizar( 
				@Valid @ModelAttribute("Cliente")Cliente cliente,
				BindingResult result ) {
			
			Repo.save(cliente);
			
			return "redirect:/";
			
			
		}
		
	// Ruta get / (listado)
		@GetMapping("/")
		public String inicio(Model model) {
			//Listado de Clientes
			model.addAttribute("Cliente", Repo.findAll());
			return "index";
		}
		// Ruta get / (listado2)
		@GetMapping("/clientes")
		public String clientes(Model model) {
			//Listado de Clientes
			model.addAttribute("Cliente", Repo.findAll());
			return "clientes";
		}	
		
	// Ruta post / registrar
	@PostMapping("/registrar")
	public String registrar( 
			@Valid @ModelAttribute("Cliente")Cliente empleado,
			BindingResult result ) {
		
		Repo.save(empleado);
		
		return "redirect:/";
		
		
	}
}
