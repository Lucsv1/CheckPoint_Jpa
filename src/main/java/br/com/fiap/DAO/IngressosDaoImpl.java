package br.com.fiap.DAO;

import javax.persistence.EntityManager;

import br.com.fiap.Entity.Ingressos;

public class IngressosDaoImpl extends GenericDaoImpl<Ingressos, Integer> implements IngressosDao {

	public IngressosDaoImpl(EntityManager ent) {
		super(ent);
	}

}
