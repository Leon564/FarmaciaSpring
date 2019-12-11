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
import com.happypet.Farmacia.entidades.Medicamento;
import com.happypet.Farmacia.entidades.Proveedor;
import com.happypet.Farmacia.repositorio.RepoMedicamento;
import com.happypet.Farmacia.repositorio.RepoProveedor;

@Controller
public class MedicamentoController {
	// Ruta get / (listado2)
	@Autowired
	RepoMedicamento Repo;
	
	
	@Autowired
	RepoProveedor Repoproveedor;
	
	@GetMapping("/medicamentos")
	public String Medicamentos(Model model) {
		//Listado de Clientes
		model.addAttribute("Medicamento", Repo.findAll());
		return "Medicamentos";
	}
	//maping nuevo.html
		@GetMapping("/nuevomedicamento")
		public String nuevo(Model model) {
			model.addAttribute("proveedores", Repoproveedor.findAll());
			return "nuevomedicamento";
		}
		// Ruta post / registrar
		@PostMapping("/registrarmedicamento")
		public String registrarmedicamento( 
				@Valid @ModelAttribute("Medicamento")Medicamento medicamento,
				BindingResult result ) {
			
			Repo.save(medicamento);
			
			return "redirect:/medicamentos";
			
			
		}
		
		// Ruta get /editarmedicamento/{id}
				@GetMapping("/editarmedicamento/{id}")
				public String editar(@PathVariable("id")int id,Model model) {
					model.addAttribute("Medicamento", Repo.findById(id));
					return "editarmedicamento";
				}
				
				
				// Ruta post /editar
				
				@PostMapping("/actualizarmedicamento")
				public String actualizarcliente( 
						@Valid @ModelAttribute("Medicamento")Medicamento medicamento,
						BindingResult result ) {
					
					Repo.save(medicamento);
					
					return "redirect:/medicamentos";
					
					
				}
				
				// Ruta get /eliminar/{id}
				@GetMapping("/eliminarmedicamento/{id}")
				public String eliminarmedicamento(@PathVariable("id")int id) {
					Repo.deleteById(id);
					return "redirect:/medicamentos";
				}
				
}
