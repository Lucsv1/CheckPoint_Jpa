package br.com.fiap.DAO;

import javax.persistence.EntityManager;

import br.com.fiap.Entity.Locais;

public class LocaisDaoImpl extends GenericDaoImpl<Locais, Integer> implements LocaisDao{

	public LocaisDaoImpl(EntityManager ent) {
		super(ent);
		
	}

}
