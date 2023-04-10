package br.com.fiap.Views;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.DAO.LocaisDao;
import br.com.fiap.DAO.LocaisDaoImpl;
import br.com.fiap.Entity.Locais;
import br.com.fiap.Execptions.EntityNotFind;
import br.com.fiap.Execptions.ExceptionCommit;
import br.com.fiap.Singleton.EntityManagerFactorySngleton;

public class ViewLocais {
	public static void main(String[] args) {
		EntityManagerFactory factory = EntityManagerFactorySngleton.getInstance();
		EntityManager ent = factory.createEntityManager();
		
		LocaisDao locaisDao = new LocaisDaoImpl(ent);
		
		//cadastrar
		Locais locais = new Locais("Lolla2", "estagio do curitia", 100);
		locaisDao.cadastrar(locais);
		try {
			locaisDao.commit();
		} catch (ExceptionCommit e) {
			e.printStackTrace();
		}
		
		//buscar
		Locais locais2 = null;
		try {
			locais2 = locaisDao.pesquisar(1);
		} catch (EntityNotFind e) {
			e.printStackTrace();
		}
		
		//Atualizar
		Locais locais3 = new Locais("Rock in Rio", "meio do mato", 50);
		locais3.setCodigoLocal(1);
		locaisDao.cadastrar(locais3);
		try {
			locaisDao.commit();
		} catch (ExceptionCommit e) {
			e.printStackTrace();
		}
		
		//deletar
		try {
			locaisDao.deletar(1);
		} catch (EntityNotFind e) {
			e.printStackTrace();
		}
		try {
			locaisDao.commit();
		} catch (ExceptionCommit e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	

}
