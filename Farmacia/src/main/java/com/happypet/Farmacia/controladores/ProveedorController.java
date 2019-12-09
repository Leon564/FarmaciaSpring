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
import com.happypet.Farmacia.entidades.Proveedor;
import com.happypet.Farmacia.repositorio.RepoProveedor;



@Controller
public class ProveedorController {
	@Autowired
	RepoProveedor Repo;
	
	
	
	// Ruta get / (listadoprov)
			@GetMapping("/proveedores")
			public String clientes(Model model) {
				//Listado de Clientes
				model.addAttribute("Proveedor", Repo.findAll());
				return "Proveedores";
			}	
			
	
	
	
	
	//maping nuevo.html
	@GetMapping("/nuevoproveedor")
	public String nuevo() {
		return "nuevoProveedor";
	}
	
	// Ruta post / registrarprov
		@PostMapping("/registrarproveedor")
		public String registrar( 
				@Valid @ModelAttribute("Proveedor")Proveedor proveedor,
				BindingResult result ) {
			
			Repo.save(proveedor);
			
			return "redirect:/";
			
			
		}
		
		
		// Ruta get /editarcliente/{id}
				@GetMapping("/editarproveedor/{id}")
				public String editar(@PathVariable("id")int id,Model model) {
					model.addAttribute("Proveedor", Repo.findById(id));
					return "editarproveedor";
				}
				
				
				// Ruta post /editar
				
				@PostMapping("/actualizarProveedor")
				public String actualizarcliente( 
						@Valid @ModelAttribute("Proveedor")Proveedor proveedor,
						BindingResult result ) {
					
					Repo.save(proveedor);
					
					return "redirect:/proveedores";
					
					
				}
				
				// Ruta get /eliminar/{id}
				@GetMapping("/eliminarproveedor/{id}")
				public String eliminarproveedor(@PathVariable("id")int id) {
					Repo.deleteById(id);
					return "redirect:/proveedores";
				}
				
		
}
