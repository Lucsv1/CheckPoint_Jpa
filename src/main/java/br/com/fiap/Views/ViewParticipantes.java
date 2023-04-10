package br.com.fiap.Views;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.DAO.ParticipantesDao;
import br.com.fiap.DAO.ParticipantesDaoImpl;
import br.com.fiap.Entity.Participantes;
import br.com.fiap.Execptions.EntityNotFind;
import br.com.fiap.Execptions.ExceptionCommit;
import br.com.fiap.Singleton.EntityManagerFactorySngleton;

public class ViewParticipantes {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = EntityManagerFactorySngleton.getInstance();
		EntityManager ent = factory.createEntityManager();

		ParticipantesDao participantesDao = new ParticipantesDaoImpl(ent);
		
//		//Cadastrar Participante
//		
//		Participantes participantes = new Participantes("Lucas", "Rua Portao Preto", "11982668958", "lcasgalindo@gmail.com");
//		participantesDao.cadastrar(participantes);
//		try {
//			participantesDao.commit();
//		} catch (ExceptionCommit e) {
//			e.printStackTrace();
//		}
		
//		//buscar 
//		Participantes participantes2 = null;
//		try {
//			participantes2 = participantesDao.pesquisar(1);
//		} catch (EntityNotFind e) {
//			e.printStackTrace();
//		}
		
		//atualizar
		Participantes participantes3 = new Participantes("Joao", "Rua dois", "11982668954", "joaomota@gmail.com");
		participantes3.setCodigoParticipante(1);
		participantesDao.cadastrar(participantes3);
		try {
			participantesDao.commit();
		} catch (ExceptionCommit e) {
			e.printStackTrace();
		}
		
		//deletar
		try {
			participantesDao.deletar(1);
		} catch (EntityNotFind e) {
			e.printStackTrace();
		}
	}
		
}
