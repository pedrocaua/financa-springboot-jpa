package com.pedro.financa.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedro.financa.entities.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
	
}
