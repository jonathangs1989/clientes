package com.telefonos.jonathan.controller;

import org.springframework.web.bind.annotation.*;
import org.slf4j.*;
import lombok.*;

@RequestMapping("/api/producto")
@Slf4j

public class ProductoController {
	
	@GetMapping("/consulta")
	public void consultaproducto() {
		log.info("Inicia consulta");
	}
	
	@PostMapping("/inserta")
	public ResponseEntity<?> insertproducto() {
		log.info("Inicia consulta");
	}
	
	@PutMapping("/actualiza")
	public void actualizarproducto() {
		log.info("Inicia consulta");
		
	}
	
	@DeleteMapping("/elimina")
	public void eliminaproducto() {
		log.info("Inicia consulta");
	}

}
