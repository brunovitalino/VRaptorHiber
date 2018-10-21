package br.com.bv.model.jpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GerarTabelasController {

	public static void main(String[] args)
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("db_sqlserver"); // ou db_postgres
		System.err.println("Database conectado.\n");
		
		factory.close();
		System.err.println("Database desconectado!\n");
	}

}
