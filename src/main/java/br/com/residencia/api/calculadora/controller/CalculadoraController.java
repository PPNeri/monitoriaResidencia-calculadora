package br.com.residencia.api.calculadora.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

	// metodos
	// Get-Buscas
	// Post-Inserir dados
	// PUT-Editar os dados
	// Delete-excluir dados

	@GetMapping("/soma")
	public int soma(@RequestParam int n1, @RequestParam int n2, @RequestParam int n3) {

		return n1 + n2 + n3;

	}

	@GetMapping("/div")
	public String div(@RequestParam double n1, @RequestParam double n2) {
		double resultado = n1 / n2;
		return "Maior Valor " + resultado;

	}

	@GetMapping("/produto")
	public String prodQtd(@RequestParam String produto, @RequestParam int preco) {
		return "O produto " + produto + " Custa " + preco + " reais";
	}

}
