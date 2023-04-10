package br.com.fiap.Views;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.DAO.ParticipantesDao;
import br.com.fiap.DAO.ParticipantesDaoImpl;
import br.com.fiap.Entity.Participantes;
import br.com.fiap.Execptions.ExceptionCommit;
import br.com.fiap.Singleton.EntityManagerFactorySngleton;

public class ViewParticipantes {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = EntityManagerFactorySngleton.getInstance();
		EntityManager ent = factory.createEntityManager();

		ParticipantesDao participantesDao = new ParticipantesDaoImpl(ent);
		
		//Cadastrar Participante
		
		Participantes participantes = new Participantes("Lucas", "Rua Portao Preto", "11982668958", "lcasgalindo@gmail.com");
		participantesDao.cadastrar(participantes);
		try {
			participantesDao.commit();
		} catch (ExceptionCommit e) {
			e.printStackTrace();
		}
		
	}
		
}
