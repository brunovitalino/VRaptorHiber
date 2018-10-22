package br.com.bv.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.bv.model.Usuario;

public class UsuarioDao {
	
	protected EntityManagerFactory emf;
	
	public UsuarioDao()
	{
		this.emf = Persistence.createEntityManagerFactory("db_sqlserver"); // ou db_postgres
		System.out.println("Database conectado!\n");
	}
	
	//Metodo usado pela camada de controle para fechamento de conexao
	public void close()
	{
		this.emf.close();
		System.out.println("Database desconectado.\n");
	}
	
	public List<Usuario> findAll() {
		EntityManager em = this.emf.createEntityManager();
		String comandoJPQL = "";
		List<Usuario> usuarios;
		
		//comandoJPQL =	"SELECT u FROM Usuario AS u ";
		
		Query q = em.createQuery("FROM Usuario");
		usuarios = q.getResultList();
		
		em.close();
		
		return usuarios;
	}
	
	public List<Usuario> findAllByNome(String nome) {
		EntityManager em = this.emf.createEntityManager();
		String comandoJPQL = "";
		List<Usuario> usuarios;
		
		comandoJPQL = "SELECT u FROM Usuario AS u "
				+ "	WHERE u.nome LIKE :paramNome";
		
		Query q = em.createQuery(comandoJPQL);
		nome = "%" + nome + "%";
		q.setParameter("paramNome", nome);
		usuarios = q.getResultList();
		
		em.close();
		
		return usuarios;
	}
	
	public Usuario findOneById(Integer id) {
		EntityManager em = this.emf.createEntityManager();
		
		em.getTransaction().begin();
		// Usuario sera pesquisado pelo id
		Usuario usuario = em.find(Usuario.class, id);
		
		em.close();
		
		return usuario;
	}
	
	public Usuario findOneByLogin(String login) {
		EntityManager em = this.emf.createEntityManager();
		String comandoJPQL = "";
		List<Usuario> usuarios;
		
		comandoJPQL = "SELECT u FROM Usuario AS u "
				+ "	WHERE u.login LIKE :paramLogin";
		
		Query q = em.createQuery(comandoJPQL);
		q.setParameter("paramLogin", login);
		usuarios = q.getResultList();
		
		Usuario usuario = null;
		
		if (usuarios.size() > 0)
			usuario = usuarios.get(0);
		
		em.close();
		
		return usuario;
	}
	
	public boolean save(Usuario u) {		
		EntityManager em = this.emf.createEntityManager();
		
		em.getTransaction().begin();
		// Usuario sera adicionado ao db
		em.persist(u);
		em.getTransaction().commit();
		
		em.close();
		
		return true;
	}
	
	public boolean update(Usuario u) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.merge(u);
		em.getTransaction().commit();
		
		em.close();
		
		return true;
	}
	
	public Usuario delete(Integer id) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		// Usuario sera removido pelo id
		Usuario usuario = em.find(Usuario.class, id);
		em.remove(usuario);
		em.getTransaction().commit();
		
		em.close();

		return (usuario);
	}

}
