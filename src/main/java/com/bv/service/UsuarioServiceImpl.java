package com.bv.service;

import java.util.List;

import br.com.bv.model.Usuario;
import br.com.bv.model.dao.UsuarioDao;

public class UsuarioServiceImpl implements UsuarioService {
	
	private UsuarioDao usuarioDao;

	public UsuarioServiceImpl(UsuarioDao usuarioDao) {
		this.usuarioDao = usuarioDao;
	}

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario find(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void save(Usuario usuario) {
		
		if (usuarioDao.save(usuario))
			System.err.println("Usuário " + usuario.getLogin() + " foi salvo.");
		else
			System.err.println("Usuário " + usuario.getLogin() + " não foi salvo.");
		
	}

	@Override
	public void update(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub
		
	}

}
