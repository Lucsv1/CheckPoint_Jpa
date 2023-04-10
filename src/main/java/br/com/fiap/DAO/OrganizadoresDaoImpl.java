package br.com.fiap.DAO;

import javax.persistence.EntityManager;

import br.com.fiap.Entity.Organizadores;

public class OrganizadoresDaoImpl extends GenericDaoImpl<Organizadores, Integer> implements OrganizadoresDao {

	public OrganizadoresDaoImpl(EntityManager ent) {
		super(ent);
		
	}

}
