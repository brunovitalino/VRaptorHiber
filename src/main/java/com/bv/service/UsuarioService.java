package com.bv.service;

import java.util.List;

import br.com.bv.model.Usuario;

public interface UsuarioService {

	public List<Usuario> findAll();
	public Usuario find(Long id);	
	public void save(Usuario usuario);
	public void update(Usuario usuario);
	public void remove(Long id);
}
