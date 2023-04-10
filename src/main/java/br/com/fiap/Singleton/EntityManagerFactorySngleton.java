package br.com.fiap.Singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySngleton {
	
	private static EntityManagerFactory factory;
	
	private EntityManagerFactorySngleton() {
		
	}
	
	public static EntityManagerFactory getInstance() {
		if (factory == null ) {
			factory = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		}
		return factory;
	}

}
