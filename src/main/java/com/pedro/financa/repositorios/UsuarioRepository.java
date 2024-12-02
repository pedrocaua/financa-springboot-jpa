package com.pedro.financa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedro.financa.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
}
