package br.com.fiap.DAO;

import javax.persistence.EntityManager;

import br.com.fiap.Entity.Participantes;

public class ParticipantesDaoImpl extends GenericDaoImpl<Participantes, Integer> implements ParticipantesDao {

	public ParticipantesDaoImpl(EntityManager ent) {
		super(ent);
		
	}

}
