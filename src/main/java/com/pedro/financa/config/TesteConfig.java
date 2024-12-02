package com.pedro.financa.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.pedro.financa.entities.Usuario;
import com.pedro.financa.repositories.UsuarioRepository;

@Configuration
@Profile("test") 				//nome precisa esta igual ao application
public class TesteConfig implements CommandLineRunner {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Usuario u1 = new Usuario(null, "Pedro Caua", "pedro.cauasalgado@gmail.com", "112233");
		Usuario u2 = new Usuario(null, "David Caue", "david.caue@gmail.com", "447755");
		
		usuarioRepository.saveAll(Arrays.asList(u1, u2));
		
	} 
	 
	
	
}
