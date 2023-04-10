package br.com.fiap.DAO;

import javax.persistence.EntityManager;

import br.com.fiap.Entity.Eventos;

public class EventosDaoImpl extends GenericDaoImpl<Eventos, Long> implements EventosDao {

	public EventosDaoImpl(EntityManager ent) {
		super(ent);
	}

}
