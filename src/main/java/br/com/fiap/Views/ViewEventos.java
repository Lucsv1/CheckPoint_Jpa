package br.com.fiap.Views;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.DAO.EventosDao;
import br.com.fiap.DAO.EventosDaoImpl;
import br.com.fiap.Entity.Eventos;
import br.com.fiap.Enum.TipoEventoEnum;
import br.com.fiap.Execptions.EntityNotFind;
import br.com.fiap.Execptions.ExceptionCommit;
import br.com.fiap.Singleton.EntityManagerFactorySngleton;

public class ViewEventos {

	public static void main(String[] args) {
	  EntityManagerFactory factory = EntityManagerFactorySngleton.getInstance();
	  EntityManager ent = factory.createEntityManager();
	  
	  EventosDao eveDao = new EventosDaoImpl(ent);
	  
	  //cadastrar
	  Eventos eventos = new Eventos("Show Fest", "CEO", TipoEventoEnum.ROCK);
	  eveDao.cadastrar(eventos);
	  try {
		eveDao.commit();
	} catch (ExceptionCommit e) {
		e.printStackTrace();
	}
	  
	  //buscar
	  Eventos eventos2 = null;
	  try {
		eventos2 = eveDao.pesquisar(1);
	    System.out.println(eventos2);
	} catch (EntityNotFind e) {
		e.printStackTrace();
	}
	  
	  //ataulizar
	  Eventos eventos3 = new Eventos("summer fest", "CEO FEST ", TipoEventoEnum.POP);
	  eventos3.setCodigoEvento(1);
	  eveDao.cadastrar(eventos3);
	  try {
		eveDao.commit();
	} catch (ExceptionCommit e) {
		e.printStackTrace();
	}
	  
	  //deletar
	  try {
		eveDao.deletar(1);
	} catch (EntityNotFind e) {
		e.printStackTrace();
	}
	  try {
		eveDao.commit();
	} catch (ExceptionCommit  e) {
		e.printStackTrace();
	}
	  
	  
	  

	}

}
