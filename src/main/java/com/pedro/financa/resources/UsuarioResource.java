package com.pedro.financa.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedro.financa.entities.Usuario;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {					//camada de recursos

	@GetMapping
	public ResponseEntity<Usuario> findAll(){
		 Usuario u = new Usuario(1L, "Pedro Caua", "pedro.cauasalgado@gmail.com", "123456");
		 return ResponseEntity.ok().body(u);
	}
}
