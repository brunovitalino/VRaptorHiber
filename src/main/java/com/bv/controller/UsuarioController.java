package com.bv.controller;

import javax.annotation.Resource;

import com.bv.service.UsuarioServiceImpl;

import br.com.bv.model.Usuario;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;

@Resource
@Path("/Usuario")
public class UsuarioController {

	private Result result;
	private UsuarioServiceImpl usuarioService;

	public UsuarioController(Result result, UsuarioServiceImpl usuarioService) {
		this.result = result;
		this.usuarioService = usuarioService;
	}

	@Get
	@Path(value="/", priority=2)
	public void index() {
		result.include("msg", "Preencha o campo.");
	}
	
	@Post
	@Path(value="/save")
	public void save(Usuario usuario) {
		try {
			usuarioService.save(usuario);
			result.use(Results.json()).from("success").serialize();
		}catch (Exception e) {
			result.use(Results.json()).from(e).serialize();			
		}
	}
	
}