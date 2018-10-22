package com.bv.controller;

import br.com.bv.model.Usuario;
import br.com.bv.model.jpa.UsuarioJPA;

public class GerarTabelasController {

	public static void main(String[] args)
	{
		Usuario usuario;
		UsuarioJPA usuarioJPA;
		
		usuarioJPA = new UsuarioJPA();		
		usuario = usuarioJPA.findOneByLogin("admin");
		
		// Caso o usuario nao exista, ele sera cadastrado.
		if (usuario == null) {
			
			usuario = new Usuario();
			usuario.setNome("Bruno Vitalino");
			usuario.setEmail("brunovitalino@hotmail.com");
			usuario.setLogin("admin");
			usuario.setSenha("admin");
			
			if (usuarioJPA.save(usuario))
				System.err.println("Usuário " + usuario.getLogin() + " foi cadastrado.");
			else
				System.err.println("Usuário " + usuario.getLogin() + " não foi cadastrado.");
			
		}
		
		usuarioJPA.close();
	}

}
