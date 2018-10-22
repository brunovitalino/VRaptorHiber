package br.com.bv.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.bv.model.Enfermeiro;
import br.com.bv.model.Usuario;


public class EnfermeiroDao {
	
	protected EntityManagerFactory emf;
	
	public EnfermeiroDao()
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
	
	public List<Enfermeiro> findAll() {
		EntityManager em = this.emf.createEntityManager();
		String comandoJPQL = "";
		List<Enfermeiro> enfermeiros;
		
		comandoJPQL =	"SELECT u FROM Usuario AS u ";
		
		Query q = em.createQuery(comandoJPQL);
		enfermeiros = q.getResultList();
		
		em.close();
		
		return enfermeiros;
	}
	
	public Enfermeiro findOneById(Integer id) {
		EntityManager em = this.emf.createEntityManager();
		
		em.getTransaction().begin();
		// Enfermeiro sera pesquisado pelo id
		Enfermeiro enfermeiro = em.find(Enfermeiro.class, id);
		
		em.close();
		
		return enfermeiro;
	}
	
	public List<Enfermeiro> findAllByNome(String nome) {
		EntityManager em = this.emf.createEntityManager();
		String comandoJPQL = "";
		List<Enfermeiro> enfermeiros;
		
		comandoJPQL =	"SELECT c FROM Enfermeiro AS c " +
						"WHERE c.nome LIKE :paramNome";
		
		Query q = em.createQuery(comandoJPQL);
		nome = "%" + nome + "%";
		q.setParameter("paramNome", nome);
		enfermeiros = q.getResultList();
		
		em.close();
		
		return enfermeiros;
	}
	
	public String save(Enfermeiro e) {
		
		EntityManager em = this.emf.createEntityManager();
		
		em.getTransaction().begin();
		// Cliente sera adicionado ao db
		em.persist(e);
		em.getTransaction().commit();
		
		em.close();
		
		return ("ID "+e.getId()+": " + e.getNome() + " adicionado com sucesso.");
	}
	
	public void update(Enfermeiro e) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.merge(e);
		em.getTransaction().commit();
		
		em.close();
	}
	
	public Enfermeiro remove(Integer id) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		// Enfermeiro sera removido pelo id
		Enfermeiro enfermeiro = em.find(Enfermeiro.class, id);
		em.remove(enfermeiro);
		em.getTransaction().commit();
		
		em.close();

		return (enfermeiro);
	}

}
