package br.com.fiap.Views;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.DAO.OrganizadoresDao;
import br.com.fiap.DAO.OrganizadoresDaoImpl;
import br.com.fiap.Entity.Organizadores;
import br.com.fiap.Execptions.EntityNotFind;
import br.com.fiap.Execptions.ExceptionCommit;
import br.com.fiap.Singleton.EntityManagerFactorySngleton;

public class ViewOrganizadores {
	
	public static void main(String[] args) {
	
		EntityManagerFactory factory = EntityManagerFactorySngleton.getInstance();
		EntityManager ent = factory.createEntityManager();
		
		OrganizadoresDao orgaDao = new OrganizadoresDaoImpl(ent);
		
		//cadastrar
		Organizadores organizadores = new Organizadores("Lucas", "lcasgalindo", "1198268958", "Rua dj");
		orgaDao.cadastrar(organizadores);
		try {
			orgaDao.commit();
		} catch (ExceptionCommit e) {
			e.printStackTrace();
		}
		
		//buscar
		
		Organizadores organizadores2 = null;
		try {
			organizadores2 = orgaDao.pesquisar(1);
		} catch (EntityNotFind e) {
			e.printStackTrace();
		}
		
		//atualizar
		
		Organizadores organizadores3 = new Organizadores("joao paulo", "joaopaulo@gmail.com", "11982668958", "rua tres");
		organizadores3.setCodigoOrganizadores(1);
		orgaDao.cadastrar(organizadores3);
		try {
			orgaDao.commit();
		} catch (ExceptionCommit e) {
			e.printStackTrace();
		}
		
		//deletar
		try {
			orgaDao.deletar(1);
		} catch (EntityNotFind e) {
			e.printStackTrace();
		}
		try {
			orgaDao.commit();
		} catch (ExceptionCommit e) {
			e.printStackTrace();
		}
		
		
	}
	

}
