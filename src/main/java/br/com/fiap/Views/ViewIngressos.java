package br.com.fiap.Views;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;

import br.com.fiap.DAO.IngressosDao;
import br.com.fiap.DAO.IngressosDaoImpl;
import br.com.fiap.Entity.Ingressos;
import br.com.fiap.Enum.TipoIngressoEnum;
import br.com.fiap.Execptions.EntityNotFind;
import br.com.fiap.Execptions.ExceptionCommit;
import br.com.fiap.Singleton.EntityManagerFactorySngleton;

public class ViewIngressos {

	public static void main(String[] args) {
		EntityManagerFactory factory = EntityManagerFactorySngleton.getInstance();
		EntityManager ent = factory.createEntityManager();
		
		IngressosDao ingressosDao = new IngressosDaoImpl(ent);
		
		//cadastrar
		Ingressos ingressos = new Ingressos(259.99, 50, TipoIngressoEnum.COMUM, new GregorianCalendar(2004, Calendar.JANUARY, 21));
		ingressosDao.cadastrar(ingressos);
		try {
			ingressosDao.commit();
		} catch (ExceptionCommit e) {
			e.printStackTrace();
		}
		
		//buscar
		Ingressos ingressos2 = null;
		try {
		    ingressos2 = ingressosDao.pesquisar(1);
		    System.out.println(ingressos2);
		} catch (EntityNotFind e) {
			e.printStackTrace();
		}
		
		//atulizar
		Ingressos ingressos3 = new Ingressos(150.99, 10, TipoIngressoEnum.ESTUDANTE, new GregorianCalendar(2006, Calendar.AUGUST, 13));
		ingressos3.setCodigoIngresso(1);
		ingressosDao.cadastrar(ingressos3);
		try {
			ingressosDao.commit();
		} catch (ExceptionCommit e) {
			e.printStackTrace();
		}
		
		//deletar
		try {
			ingressosDao.deletar(1);
		} catch (EntityNotFind e) {
			e.printStackTrace();
		}
		try {
			ingressosDao.commit();
		} catch (ExceptionCommit e) {
		    e.printStackTrace();
		}
	}

}
