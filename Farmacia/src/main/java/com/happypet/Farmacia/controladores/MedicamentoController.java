package com.happypet.Farmacia.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


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
}
