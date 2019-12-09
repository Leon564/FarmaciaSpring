package com.happypet.Farmacia.controladores;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.happypet.Farmacia.entidades.Cliente;
import com.happypet.Farmacia.entidades.Medicamento;
import com.happypet.Farmacia.entidades.Proveedor;
import com.happypet.Farmacia.repositorio.RepoMedicamento;

@Controller
public class MedicamentoController {
	// Ruta get / (listado2)
	@Autowired
	RepoMedicamento Repo;
	
	
	@GetMapping("/medicamentos")
	public String Medicamentos(Model model) {
		//Listado de Clientes
		model.addAttribute("Medicamento", Repo.findAll());
		return "Medicamentos";
	}
	//maping nuevo.html
		@GetMapping("/nuevomedicamento")
		public String nuevo() {
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
}
